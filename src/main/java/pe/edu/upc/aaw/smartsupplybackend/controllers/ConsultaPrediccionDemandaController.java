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
        ConsultaPrediccionDemanda consulta = m.map(dto, ConsultaPrediccionDemanda.class);
        cS.insert(consulta);


        PredictionRequestDTO p = new PredictionRequestDTO();
        p.setFechaInicio(dto.getFechaInicio());
        p.setFechaFin(dto.getFechaFin());
        p.setTipoArticuloName(dto.getArticulo().getNombreArticulo());
        System.out.println(p);
        PredictionResponseDTO response = pC.predecir(p);

        if (response != null && response.getPredictions() != null) {
            for (PredictionResponseDTO.PrediccionDiaDTO dia : response.getPredictions()) {

                HistorialDemanda h = new HistorialDemanda();

                h.setConsulta(consulta);

                h.setArticulo(consulta.getArticulo());

                h.setFecha(dia.getFecha());
                h.setCantidad(dia.getDemandaPronosticada());
                h.setTipoRegistro("PREDICCION");

                hS.insert(h);
            }
        }

        return response;
    }

}
