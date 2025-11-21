package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;
import pe.edu.upc.aaw.smartsupplybackend.entities.HistorialDemanda;

import java.util.List;

public interface IHistorialDemandaService {
    public List<HistorialDemanda> list();
    public HistorialDemanda listId(Long id);
    public void insert(HistorialDemanda historial);
}
