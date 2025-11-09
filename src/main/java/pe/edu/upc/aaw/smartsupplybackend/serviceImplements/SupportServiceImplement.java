package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.Support;
import pe.edu.upc.aaw.smartsupplybackend.repositories.ISupportRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.ISupportService;

import java.util.List;

@Service
public class SupportServiceImplement implements ISupportService {

    @Autowired
    private ISupportRepository dR;

    @Override
    public void insert(Support support) {
        dR.save(support);
    }

    @Override
    public List<Support> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idSupport) {
        dR.deleteById(idSupport);
    }

    @Override
    public Support listId(int idSupport) {
        return dR.findById(idSupport).orElse(new Support());
    }

    @Override
    public List<String[]> inciddenciasXMes() {
        return dR.inciddenciasXMes();
    }


}
