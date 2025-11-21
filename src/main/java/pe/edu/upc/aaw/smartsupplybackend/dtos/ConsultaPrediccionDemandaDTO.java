package pe.edu.upc.aaw.smartsupplybackend.dtos;

import pe.edu.upc.aaw.smartsupplybackend.entities.Articulo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaPrediccionDemandaDTO {

    private Long idConsulta;
    private Articulo articulo;

    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private LocalDateTime createdAt;

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
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

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
