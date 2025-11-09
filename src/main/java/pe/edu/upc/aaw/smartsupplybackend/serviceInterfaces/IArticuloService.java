package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.entities.Articulo;
import pe.edu.upc.aaw.smartsupplybackend.entities.Usuario;

import java.util.List;

public interface IArticuloService {
    public void insert(Articulo articulo);
    public List<Articulo> list();
    public void delete(Long idArticulo);
    public Articulo listid(Long idArticulo);}
