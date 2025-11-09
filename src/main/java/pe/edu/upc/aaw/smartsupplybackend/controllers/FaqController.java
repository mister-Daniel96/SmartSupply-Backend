package pe.edu.upc.aaw.smartsupplybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.smartsupplybackend.dtos.FaqDTO;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.IFaqService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/faqs")
public class FaqController {
    @Autowired
    private IFaqService fS;

    @GetMapping
    public List<FaqDTO> lista(){
        return fS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, FaqDTO.class);
        }).collect(Collectors.toList());
    }
    // consulta usando el @RequestParam es muy interesante pero por ahora solo consultamos lo que es preguntas generales
}
