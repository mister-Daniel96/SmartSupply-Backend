package pe.edu.upc.aaw.smartsupplybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.smartsupplybackend.dtos.ConsultaPrediccionDemandaDTO;
import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionRequestDTO;
import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionResponseDTO;
import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;
import pe.edu.upc.aaw.smartsupplybackend.entities.HistorialDemanda;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IConsultaPrediccionDemandaService;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IHistorialDemandaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/consultas")
public class ConsultaPrediccionDemandaController {
    @Autowired
    private IConsultaPrediccionDemandaService cS;
    @Autowired
    private PrediccionController pC;
    @Autowired
    private IHistorialDemandaService hS;

    @GetMapping
    public List<ConsultaPrediccionDemandaDTO> lista() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ConsultaPrediccionDemandaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public PredictionResponseDTO insertar(@RequestBody ConsultaPrediccionDemandaDTO dto) {


        ModelMapper m = new ModelMapper();
        // 1. Mapear DTO -> entidad y guardar cabecera
        ConsultaPrediccionDemanda consulta = m.map(dto, ConsultaPrediccionDemanda.class);
        cS.insert(consulta); // aquí ya debería generarse el idConsulta


        // 2. Armar request para el modelo de ML (FastAPI)
        PredictionRequestDTO p = new PredictionRequestDTO();
        p.setFechaInicio(dto.getFechaInicio());
        p.setFechaFin(dto.getFechaFin());
        p.setTipoArticuloName(dto.getArticulo().getNombreArticulo());
        // asumimos que nombreArticulo = "Technology", "Furniture", etc.
        System.out.println(p);
        // 3. Llamar al modelo y obtener la respuesta
        PredictionResponseDTO response = pC.predecir(p);

        // 4. Guardar cada día de la predicción en HistorialDemanda
        if (response != null && response.getPredictions() != null) {
            for (PredictionResponseDTO.PrediccionDiaDTO dia : response.getPredictions()) {

                HistorialDemanda h = new HistorialDemanda();

                // Relación con la cabecera de consulta
                h.setConsulta(consulta);

                // Relación con artículo (usamos el mismo artículo de la consulta)
                h.setArticulo(consulta.getArticulo());

                // Datos de la predicción
                h.setFecha(dia.getFecha());                      // fecha predicha
                h.setCantidad(dia.getDemandaPronosticada());     // demanda del modelo
                h.setTipoRegistro("PREDICCION");                 // marca que es predicción

                hS.insert(h);
            }
        }

        // 5. Devolver al front las predicciones
        return response;
    }

}
