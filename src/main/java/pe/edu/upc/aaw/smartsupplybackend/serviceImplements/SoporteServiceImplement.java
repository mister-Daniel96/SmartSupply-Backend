package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.Soporte;
import pe.edu.upc.aaw.smartsupplybackend.repositories.ISoporteRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.ISoporteService;

import java.util.List;

@Service
public class SoporteServiceImplement implements ISoporteService {

    @Autowired
    private ISoporteRepository dR;

    @Override
    public void insert(Soporte support) {
        dR.save(support);
    }

    @Override
    public List<Soporte> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idSupport) {
        dR.deleteById(idSupport);
    }

    @Override
    public Soporte listId(int idSupport) {
        return dR.findById(idSupport).orElse(new Soporte());
    }

    @Override
    public List<String[]> inciddenciasXMes() {
        return dR.inciddenciasXMes();
    }


}
