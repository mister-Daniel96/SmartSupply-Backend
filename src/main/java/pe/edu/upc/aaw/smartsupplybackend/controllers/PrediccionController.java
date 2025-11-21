package pe.edu.upc.aaw.smartsupplybackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionRequestDTO;
import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionResponseDTO;
import pe.edu.upc.aaw.smartsupplybackend.serviceImplements.PredictionServiceImplement;

@RestController
@RequestMapping("/predicciones")
public class PrediccionController {

    private final PredictionServiceImplement prediccionService;

    public PrediccionController(PredictionServiceImplement prediccionService) {
        this.prediccionService = prediccionService;
    }

    @PostMapping
    public PredictionResponseDTO predecir(@RequestBody PredictionRequestDTO request) {

        //System.out.println("📥 REQUEST EN JAVA → " + request.getTipoArticuloName()
       //         + " / " + request.getFechaInicio()
         //       + " / " + request.getFechaFin());

        return prediccionService.obtenerPrediccion(request);
    }


}
