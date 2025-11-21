package pe.edu.upc.aaw.smartsupplybackend.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Soporte")
public class Soporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSoporte;
    @Column(name = "fechaSoporte", nullable = false)
    private LocalDate fechaSoporte;
    @Column(name = "tituloSoporte", nullable = false, length = 50)
    private String tituloSoporte;

    @Column(name = "descripcionSoporte", nullable = false, length = 200)
    private String descripcionSoporte;

    @Column(name = "pendienteSoporte", nullable = false)
    private Boolean pendienteSoporte;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario; //siempre se usa idNombreDeLaClase

    public Soporte() {
    }

    public Soporte(int idSoporte, LocalDate fechaSoporte, String tituloSoporte, String descripcionSoporte, Boolean pendienteSoporte, Usuario usuario) {
        this.idSoporte = idSoporte;
        this.fechaSoporte = fechaSoporte;
        this.tituloSoporte = tituloSoporte;
        this.descripcionSoporte = descripcionSoporte;
        this.pendienteSoporte = pendienteSoporte;
        this.usuario = usuario;
    }

    public int getIdSoporte() {
        return idSoporte;
    }

    public void setIdSoporte(int idSoporte) {
        this.idSoporte = idSoporte;
    }

    public LocalDate getFechaSoporte() {
        return fechaSoporte;
    }

    public void setFechaSoporte(LocalDate fechaSoporte) {
        this.fechaSoporte = fechaSoporte;
    }

    public String getTituloSoporte() {
        return tituloSoporte;
    }

    public void setTituloSoporte(String tituloSoporte) {
        this.tituloSoporte = tituloSoporte;
    }

    public String getDescripcionSoporte() {
        return descripcionSoporte;
    }

    public void setDescripcionSoporte(String descripcionSoporte) {
        this.descripcionSoporte = descripcionSoporte;
    }

    public Boolean getPendienteSoporte() {
        return pendienteSoporte;
    }

    public void setPendienteSoporte(Boolean pendienteSoporte) {
        this.pendienteSoporte = pendienteSoporte;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
