package pe.edu.upc.aaw.smartsupplybackend.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(name = "nameUsuario", nullable = false, length = 100)
    private String nameUsuario;//puede ser username
    @Column(name = "passwordUsuario", nullable = false, length = 100)
    private String passwordUsuario;// puede ser password
    @Column(name = "emailUsuario", nullable = false, length = 50)
    private String emailUsuario;



    @Column(name = "phoneUsuario", nullable = false, length = 50)
    private String phoneUsuario;


    @Column(name = "rolUsuario", nullable = false, length = 50)
    private String rolUsuario;
    @Column(name = "enabledUsuario",nullable = false)
    private Boolean enabledUsuario;
    @Column(name="ageUsuario", nullable=true)
    private Long ageUsuario;
    @Column (name = "dniUsuario",nullable = true,length = 45)
    private Long dniUsuario;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TypeUser> roles;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nameUsuario, String passwordUsuario, String emailUsuario,
                   Boolean enabledUsuario, Long ageUsuario, String rolUsuario,
                   Long dniUsuario, String phoneUsuario,
                   List<TypeUser> roles) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.passwordUsuario = passwordUsuario;
        this.emailUsuario = emailUsuario;
        this.enabledUsuario = enabledUsuario;
        this.ageUsuario = ageUsuario;
        this.dniUsuario = dniUsuario;
        this.rolUsuario=rolUsuario;
        this.roles = roles;
this.phoneUsuario=phoneUsuario;
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Boolean getEnabledUsuario() {
        return enabledUsuario;
    }

    public void setEnabledUsuario(Boolean enabledUsuario) {
        this.enabledUsuario = enabledUsuario;
    }

    public List<TypeUser> getRoles() {
        return roles;
    }

    public void setRoles(List<TypeUser> roles) {
        this.roles = roles;
    }


    public Long getAgeUsuario() {
        return ageUsuario;
    }

    public void setAgeUsuario(Long ageUsuario) {
        this.ageUsuario = ageUsuario;
    }

    public Long getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(Long dniUsuario) {
        this.dniUsuario = dniUsuario;
    }
    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }
    public String getPhoneUsuario() {
        return phoneUsuario;
    }

    public void setPhoneUsuario(String phoneUsuario) {
        this.phoneUsuario = phoneUsuario;
    }

}
