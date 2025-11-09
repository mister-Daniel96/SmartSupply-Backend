package pe.edu.upc.aaw.smartsupplybackend.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "HistorialDemanda")
public class HistorialDemanda {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorialDemanda;


    @Column(name = "fechaSolicitada", nullable = false)
    private LocalDate fechaSolicitada;

    @Column(name = "cantidad", nullable = false, precision = 18, scale = 2)
    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idArticulo", nullable = false)
    private Articulo articulo;

    public HistorialDemanda() {
    }

    public HistorialDemanda(Long idHistorialDemanda, Articulo articulo, LocalDate fechaSolicitada,
                            int cantidad) {
        this.idHistorialDemanda = idHistorialDemanda;
        this.articulo = articulo;
        this.fechaSolicitada = fechaSolicitada;
        this.cantidad = cantidad;
    }

    public Long getIdHistorialDemanda() {
        return idHistorialDemanda;
    }

    public void setIdHistorialDemanda(Long idHistorialDemanda) {
        this.idHistorialDemanda = idHistorialDemanda;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public LocalDate getFechaSolicitada() {
        return fechaSolicitada;
    }

    public void setFechaSolicitada(LocalDate fechaSolicitada) {
        this.fechaSolicitada = fechaSolicitada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
