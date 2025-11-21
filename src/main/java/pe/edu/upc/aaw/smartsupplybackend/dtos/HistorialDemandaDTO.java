package pe.edu.upc.aaw.smartsupplybackend.dtos;

import pe.edu.upc.aaw.smartsupplybackend.entities.Articulo;
import pe.edu.upc.aaw.smartsupplybackend.entities.ConsultaPrediccionDemanda;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class HistorialDemandaDTO {

    private Long idHistorialDemanda;

    // Relaciones como IDs (igual harías con Articulo → idCategoria)
    private ConsultaPrediccionDemanda consulta;   // puede ser null si es REAL
    private Articulo articulo;

    private LocalDate fecha;
    private Double cantidad;
    private String tipoRegistro;  // REAL o PREDICCION

    private LocalDateTime createdAt;

    public Long getIdHistorialDemanda() {
        return idHistorialDemanda;
    }

    public void setIdHistorialDemanda(Long idHistorialDemanda) {
        this.idHistorialDemanda = idHistorialDemanda;
    }



    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ConsultaPrediccionDemanda getConsulta() {
        return consulta;
    }

    public void setConsulta(ConsultaPrediccionDemanda consulta) {
        this.consulta = consulta;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
