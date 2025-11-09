package pe.edu.upc.aaw.smartsupplybackend.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Support")
public class Support {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSupport;
    @Column(name = "dateSupport",nullable = false)
    private LocalDate dateSupport;
    @Column(name = "descriptionSupport",nullable = false, length = 100)
    private String descriptionSupport;

    @Column( name = "pendienteSupport",nullable = false)
    private Boolean pendienteSupport;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario; //siempre se usa idNombreDeLaClase

    public Support() {
    }

    public Support(int idSupport, LocalDate dateSupport, String descriptionSupport, Boolean pendienteSupport, Usuario usuario) {
        this.idSupport = idSupport;
        this.dateSupport = dateSupport;
        this.descriptionSupport = descriptionSupport;
        this.pendienteSupport = pendienteSupport;
        this.usuario = usuario;
    }


    public Boolean isPendienteSupport() {
        return pendienteSupport;
    }

    public void setPendienteSupport(Boolean pendienteSupport) {
        this.pendienteSupport = pendienteSupport;
    }

    public int getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(int idSupport) {
        this.idSupport = idSupport;
    }

    public LocalDate getDateSupport() {
        return dateSupport;
    }

    public void setDateSupport(LocalDate dateSupport) {
        this.dateSupport = dateSupport;
    }

    public String getDescriptionSupport() {
        return descriptionSupport;
    }

    public void setDescriptionSupport(String descriptionSupport) {
        this.descriptionSupport = descriptionSupport;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
