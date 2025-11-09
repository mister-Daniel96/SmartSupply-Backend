package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.Articulo;
import pe.edu.upc.aaw.smartsupplybackend.repositories.IArticuloRepository;
import pe.edu.upc.aaw.smartsupplybackend.repositories.ICategoriaRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IArticuloService;

import java.util.List;

@Service
public class ArticuloServiceImplement implements IArticuloService {
    @Autowired
    private IArticuloRepository dR;

    @Override
    public void insert(Articulo articulo) {
        dR.save(articulo);
    }

    @Override
    public List<Articulo> list() {
        return dR.findAll();
    }

    @Override
    public void delete(Long idArticulo) {
        dR.deleteById(idArticulo);
    }

    @Override
    public Articulo listid(Long idArticulo) {
        return dR.findById(idArticulo).orElse(new Articulo());
    }
}
