package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.entities.Articulo;
import pe.edu.upc.aaw.smartsupplybackend.entities.Categoria;

import java.util.List;

public interface ICategoriaService {
    public void insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(Long idCategoria);
    public Categoria listid(Long idCategoria);}
