package pe.edu.upc.aaw.smartsupplybackend.dtos;

public class UsuarioDTO {


    private Long idUsuario;

    private String nameUsuario;

    private String passwordUsuario;

    private String emailUsuario;

    private Boolean enabledUsuario;



    private String rolUsuario;

    private Long ageUsuario;
    private Long dniUsuario;

    private String phoneUsuario;

    public String getPhoneUsuario() {
        return phoneUsuario;
    }

    public void setPhoneUsuario(String phoneUsuario) {
        this.phoneUsuario = phoneUsuario;
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

}
