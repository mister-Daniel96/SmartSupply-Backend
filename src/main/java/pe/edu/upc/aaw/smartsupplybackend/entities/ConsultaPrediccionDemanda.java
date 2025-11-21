package pe.edu.upc.aaw.smartsupplybackend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "ConsultaPrediccionDemanda")
public class ConsultaPrediccionDemanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @ManyToOne
    @JoinColumn(name = "idArticulo", nullable = false)
    private Articulo articulo;

    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;


    @Column(name = "createdAt")
    private LocalDateTime createdAt = LocalDateTime.now();

    public ConsultaPrediccionDemanda() {
    }

    public ConsultaPrediccionDemanda(Long idConsulta, Articulo articulo, LocalDate fechaInicio, LocalDate fechaFin,LocalDateTime createdAt) {
        this.idConsulta = idConsulta;
        this.articulo = articulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.createdAt = createdAt;
    }

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
