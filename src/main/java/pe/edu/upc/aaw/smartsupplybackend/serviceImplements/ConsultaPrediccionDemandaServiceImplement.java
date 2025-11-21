package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;
import pe.edu.upc.aaw.smartsupplybackend.repositories.IConsultaPrediccionDemandaRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IConsultaPrediccionDemandaService;

import java.util.List;

@Service
public class ConsultaPrediccionDemandaServiceImplement implements IConsultaPrediccionDemandaService {
    @Autowired
    private IConsultaPrediccionDemandaRepository cR;

    @Override
    public List<ConsultaPrediccionDemanda> list() {
        return cR.findAll();
    }

    @Override
    public ConsultaPrediccionDemanda listId(Long id) {
        return cR.findById(id).orElse(new ConsultaPrediccionDemanda());
    }

    @Override
    public void insert(ConsultaPrediccionDemanda consulta) {
        cR.save(consulta);
    }
}
