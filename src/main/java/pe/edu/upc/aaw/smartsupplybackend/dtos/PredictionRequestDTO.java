package pe.edu.upc.aaw.smartsupplybackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class PredictionRequestDTO {

    @JsonProperty("tipo_articulo_name")
    private String tipoArticuloName;  // opcional

    @JsonProperty("tipo_articulo_cod")
    private Integer tipoArticuloCod;  // opcional

    @JsonProperty("fecha_inicio")
    private LocalDate fechaInicio;    // debe ser LocalDate, no String

    @JsonProperty("fecha_fin")
    private LocalDate fechaFin;       // igual

    public String getTipoArticuloName() {
        return tipoArticuloName;
    }

    public void setTipoArticuloName(String tipoArticuloName) {
        this.tipoArticuloName = tipoArticuloName;
    }

    public Integer getTipoArticuloCod() {
        return tipoArticuloCod;
    }

    public void setTipoArticuloCod(Integer tipoArticuloCod) {
        this.tipoArticuloCod = tipoArticuloCod;
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
}
