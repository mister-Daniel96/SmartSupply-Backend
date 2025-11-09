package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;


import pe.edu.upc.aaw.smartsupplybackend.entities.Support;

import java.util.List;

public interface ISupportService {

    public void insert(Support support);
    public List<Support> list();
    public void delete(int idSupport);
    public Support listId(int idSupport);
    List<String[]> inciddenciasXMes();

}
