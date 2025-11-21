package pe.edu.upc.aaw.smartsupplybackend.dtos;


import pe.edu.upc.aaw.smartsupplybackend.entities.Usuario;

import java.time.LocalDate;

public class SoporteDTO {

    private int idSoporte;
    private LocalDate fechaSoporte;
    private String tituloSoporte;
    private String descripcionSoporte;
    private Boolean pendienteSoporte;

    private Usuario usuario;

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
