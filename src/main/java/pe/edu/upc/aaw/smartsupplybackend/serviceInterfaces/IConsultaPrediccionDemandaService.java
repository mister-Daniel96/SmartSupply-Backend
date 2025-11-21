package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;
import pe.edu.upc.aaw.smartsupplybackend.entities.Faq;

import java.util.List;

public interface IConsultaPrediccionDemandaService {
    public List<ConsultaPrediccionDemanda> list();
    public ConsultaPrediccionDemanda listId(Long id);
    public void insert(ConsultaPrediccionDemanda consulta);

}
