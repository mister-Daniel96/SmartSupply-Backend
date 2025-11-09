package pe.edu.upc.aaw.smartsupplybackend.dtos;



public class ArticuloDTO {

    private Long idArticulo;

    private String codigoArticulo;
    private String nombreArticulo;
    private String colorArticulo;
    private Boolean estadoArticulo;

    private CategoriaDTO categoria;

    public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getColorArticulo() {
        return colorArticulo;
    }

    public void setColorArticulo(String colorArticulo) {
        this.colorArticulo = colorArticulo;
    }

    public Boolean getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(Boolean estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
}
