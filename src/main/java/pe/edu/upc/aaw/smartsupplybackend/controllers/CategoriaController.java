package pe.edu.upc.aaw.smartsupplybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aaw.smartsupplybackend.dtos.CategoriaDTO;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.ICategoriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService cS;

    @GetMapping
    public List<CategoriaDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CategoriaDTO.class);
        }).collect(Collectors.toList());
    }
}
