package pe.edu.upc.aaw.smartsupplybackend.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.smartsupplybackend.entities.Faq;
import pe.edu.upc.aaw.smartsupplybackend.repositories.IFaqRepository;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IFaqService;

import java.util.List;
@Service
public class FaqServiceImplement implements IFaqService {

    @Autowired
    private IFaqRepository iS;

    @Override
    public List<Faq> list() {
        return iS.findAll();
    }

    @Override
    public Faq listId(Long idFaq) {
        return iS.findById(idFaq).orElse(new Faq());
    }

    @Override
    public void insert(Faq faq) {
        iS.save(faq);
    }

    @Override
    public void delete(Long idFaq) {
        iS.deleteById(idFaq);
    }
}
