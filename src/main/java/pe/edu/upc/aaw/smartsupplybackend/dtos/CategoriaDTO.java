package pe.edu.upc.aaw.smartsupplybackend.dtos;

public class CategoriaDTO {


    private Long idCategoria;


    private String nombreCategoria;



    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
