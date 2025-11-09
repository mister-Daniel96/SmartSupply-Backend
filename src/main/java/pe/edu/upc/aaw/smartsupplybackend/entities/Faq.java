package pe.edu.upc.aaw.smartsupplybackend.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Faq")
public class Faq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFaq;
    @Column(name = "preguntaFaq")
    private String preguntaFaq;
    @Column(name="respuestaFaq")
    private String respuestaFaq;

    public Faq() {
    }

    public Faq(Long idFaq, String preguntaFaq, String respuestaFaq) {
        this.idFaq = idFaq;
        this.preguntaFaq = preguntaFaq;
        this.respuestaFaq = respuestaFaq;
    }

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
