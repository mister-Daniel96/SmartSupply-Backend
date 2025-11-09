package pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces;

import pe.edu.upc.aaw.smartsupplybackend.entities.Faq;

import java.util.List;

public interface IFaqService {

    public List<Faq> list();
    public Faq listId(Long idFaq);
    public void insert(Faq faq);
    public void delete(Long idFaq);


}
