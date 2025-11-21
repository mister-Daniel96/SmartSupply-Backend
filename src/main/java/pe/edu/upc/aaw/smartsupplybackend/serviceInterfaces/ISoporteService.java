package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;


import pe.edu.upc.aaw.smartsupplybackend.entities.Soporte;
import java.util.List;

public interface ISoporteService {

    public void insert(Soporte support);
    public List<Soporte> list();
    public void delete(int idSupport);
    public Soporte listId(int idSupport);
    List<String[]> inciddenciasXMes();

}
