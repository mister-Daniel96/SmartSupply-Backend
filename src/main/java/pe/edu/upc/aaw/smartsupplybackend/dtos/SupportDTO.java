package pe.edu.upc.aaw.smartsupplybackend.dtos;


import pe.edu.upc.aaw.smartsupplybackend.entities.Usuario;

import java.time.LocalDate;

public class SupportDTO {

    private int idSupport;
    private LocalDate dateSupport;
    private String descriptionSupport;
    private Boolean pendienteSupport;

    private Usuario usuario;

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
