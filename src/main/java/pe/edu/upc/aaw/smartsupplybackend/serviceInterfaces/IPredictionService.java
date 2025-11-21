package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionRequestDTO;
import pe.edu.upc.aaw.smartsupplybackend.dtos.PredictionResponseDTO;

public interface IPredictionService {
    PredictionResponseDTO obtenerPrediccion(PredictionRequestDTO request);
}
