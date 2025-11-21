package pe.edu.upc.aaw.smartsupplybackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;

public class PredictionResponseDTO {

    @JsonProperty("predictions")
    private List<PrediccionDiaDTO> predictions;

    public List<PrediccionDiaDTO> getPredictions() {
        return predictions;
    }

    public void setPredictions(List<PrediccionDiaDTO> predictions) {
        this.predictions = predictions;
    }

    public static class PrediccionDiaDTO {

        @JsonProperty("fecha")
        private LocalDate fecha;

        @JsonProperty("tipo_articulo_codigo")
        private Integer tipoArticuloCodigo;

        @JsonProperty("tipo_articulo_nombre")
        private String tipoArticuloNombre;

        @JsonProperty("demanda_pronosticada")
        private Double demandaPronosticada;

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public Integer getTipoArticuloCodigo() {
            return tipoArticuloCodigo;
        }

        public void setTipoArticuloCodigo(Integer tipoArticuloCodigo) {
            this.tipoArticuloCodigo = tipoArticuloCodigo;
        }

        public String getTipoArticuloNombre() {
            return tipoArticuloNombre;
        }

        public void setTipoArticuloNombre(String tipoArticuloNombre) {
            this.tipoArticuloNombre = tipoArticuloNombre;
        }

        public Double getDemandaPronosticada() {
            return demandaPronosticada;
        }

        public void setDemandaPronosticada(Double demandaPronosticada) {
            this.demandaPronosticada = demandaPronosticada;
        }
    }
}
