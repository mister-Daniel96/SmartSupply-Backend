package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.HistorialDemanda;
import pe.edu.upc.aaw.smartsupplybackend.repositories.IHistorialDemandaRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IHistorialDemandaService;

import java.util.List;

@Service
public class HistorialDemandaServiceImplement implements IHistorialDemandaService {
    @Autowired
    private IHistorialDemandaRepository hR;

    @Override
    public List<HistorialDemanda> list() {
        return hR.findAll();
    }

    @Override
    public HistorialDemanda listId(Long id) {
        return hR.findById(id).orElse(new HistorialDemanda());
    }

    @Override
    public void insert(HistorialDemanda historial) {
        hR.save(historial);
    }
}
