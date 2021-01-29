package adaitw.java;

public abstract class Vehiculo {
    private Propietario propietario;
    private Autorizado autorizado;
    private String dominio;
    private Boolean profesional;

    public Vehiculo(Propietario propietario, Autorizado autorizado, String dominio, Boolean profesional) {
        this.propietario = propietario;
        this.autorizado = autorizado;
        this.dominio = dominio;
        this.profesional = profesional;
    }
}
