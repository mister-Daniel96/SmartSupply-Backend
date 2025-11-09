package pe.edu.upc.aaw.smartsupplybackend.dtos;

public class FaqDTO {
    private Long idFaq;
    private String preguntaFaq;
    private String respuestaFaq;



    public Long getIdFaq() {
        return idFaq;
    }

    public void setIdFaq(Long idFaq) {
        this.idFaq = idFaq;
    }

    public String getPreguntaFaq() {
        return preguntaFaq;
    }

    public void setPreguntaFaq(String preguntaFaq) {
        this.preguntaFaq = preguntaFaq;
    }

    public String getRespuestaFaq() {
        return respuestaFaq;
    }

    public void setRespuestaFaq(String respuestaFaq) {
        this.respuestaFaq = respuestaFaq;
    }
}
