package pe.edu.upc.aaw.smartsupplybackend.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "HistorialDemanda")
public class HistorialDemanda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorialDemanda;

    // 🔹 Relación con la cabecera de predicción (si es predicción)
    @ManyToOne
    @JoinColumn(name = "idConsulta")
    private ConsultaPrediccionDemanda consulta;

    // 🔹 Relación con artículo
    @ManyToOne
    @JoinColumn(name = "idArticulo", nullable = false)
    private Articulo articulo;

    // 🔹 Día del valor registrado
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    // 🔹 Cantidad (real o predicha)
    @Column(name = "cantidad", nullable = false)
    private Double cantidad;

    // 🔹 Tipo de registro: REAL o PREDICCION
    @Column(name = "tipoRegistro", nullable = false, length = 20)
    private String tipoRegistro;

    @Column(name = "createdAt")
    private LocalDateTime createdAt = LocalDateTime.now();

    public HistorialDemanda() {}

    public HistorialDemanda(ConsultaPrediccionDemanda consulta,
                            Articulo articulo,
                            LocalDate fecha,
                            Double cantidad,
                            String tipoRegistro) {

        this.consulta = consulta;
        this.articulo = articulo;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipoRegistro = tipoRegistro;
    }

    // ===== Getters & Setters =====

    public Long getIdHistorialDemanda() {
        return idHistorialDemanda;
    }

    public void setIdHistorialDemanda(Long idHistorialDemanda) {
        this.idHistorialDemanda = idHistorialDemanda;
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
}
