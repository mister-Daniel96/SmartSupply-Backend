package pe.edu.upc.aaw.smartsupplybackend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.smartsupplybackend.dtos.SupportDTO;
import pe.edu.upc.aaw.smartsupplybackend.entities.Support;
import pe.edu.upc.aaw.smartsupplybackend.serviceInterfaces.ISupportService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/supports")
public class SupportController {
    @Autowired
    private ISupportService dS;

    @PostMapping//es para  crear
    public void registrar(@RequestBody SupportDTO dto) {
        ModelMapper m = new ModelMapper();
        Support p = m.map(dto, Support.class);
        dS.insert(p);
    }
    @GetMapping//es para retornar
    //@PreAuthorize("hasAuthority('user') or hasAuthority('admin')")
    public List<SupportDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SupportDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping// es para modificar
    public void modificar(@RequestBody SupportDTO dto){
        ModelMapper m=new ModelMapper();
        Support d=m.map(dto,Support.class);
        dS.insert(d);
    }
    @DeleteMapping("/{id}")//es para borrar
    public void eliminar(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public SupportDTO listarId(@PathVariable("id") Integer id){
        //usamos el @PathVariable porque se usara una variable
        ModelMapper m=new ModelMapper();
        SupportDTO d=m.map(dS.listId(id),SupportDTO.class);
        return d;
    }

    //  ============   REPORTE DE JUAN

/*
    @GetMapping("/supportMes")
    List<CantidadSupportMesDTO> cantidadSupportMesDTOS(){
       List<String[]> lista= dS.inciddenciasXMes();

       List<CantidadSupportMesDTO>listaDTO=new ArrayList<>();

       for (String[]data:lista){
           CantidadSupportMesDTO dto=new CantidadSupportMesDTO();


           dto.setYear(Integer.parseInt(data[0]));
           dto.setMonth(data[1]);
           dto.setQuantitySupports(Integer.parseInt(data[2]));

           listaDTO.add(dto);
       }
       return listaDTO;
    }
    @GetMapping("/{id}")
    public PagoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        PagoDTO p= m.map(pS.listId(id),PagoDTO.class);
        return p;
    }


    @PostMapping
    public void registrar(@RequestBody DessertDTO dto){
        ModelMapper m=new ModelMapper();
        Dessert d=m.map(dto,Dessert.class);
        dS.insert(d);
    }
    @GetMapping
    public List<DessertDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DessertDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DessertDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        DessertDTO d=m.map(dS.listId(id),DessertDTO.class);
        return d;
    }
    @PostMapping("/buscar")
    public List<DessertDTO> buscar(@RequestBody LocalDate fecha){
        return dS.findByDueDateDessert(fecha).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DessertDTO.class);
        }).collect(Collectors.toList());
    }


*/
}
