package pe.edu.upc.aaw.smartsupplybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Articulo")
public class Articulo {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idArticulo;

    @Column(name="codigoArticulo",length = 200)
    private String codigoArticulo;
    @Column(name="nombreArticulo",length = 200)
    private String nombreArticulo;
    @Column(name="colorArticulo",length = 100)
    private String colorArticulo;
    @Column(name="estadoArticulo",length = 100)
    private Boolean estadoArticulo;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;


    public Articulo() {
    }

    public Articulo(Long idArticulo, String codigoArticulo, String colorArticulo, Boolean estadoArticulo, Categoria categoria, String nombreArticulo) {
        this.idArticulo = idArticulo;
        this.codigoArticulo = codigoArticulo;
        this.colorArticulo = colorArticulo;
        this.estadoArticulo = estadoArticulo;
        this.categoria = categoria;
        this.nombreArticulo=nombreArticulo;
    }

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
}
