package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    protected List<Propietario> propietarios;
    protected List <Autorizado> autorizados;
    protected String dominio;
    protected Boolean profesional;

    public Vehiculo(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        propietarios = new ArrayList<>();
        autorizados = new ArrayList<>();
        this.dominio = dominio;
        this.profesional = profesional;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public Boolean getProfesional() {
        return profesional;
    }

    public void setProfesional(Boolean profesional) {
        this.profesional = profesional;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public List<Autorizado> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(List<Autorizado> autorizados) {
        this.autorizados = autorizados;
    }

    public String fichaTecnica(){
        return "Propietario: "+propietarios+ "Autorizado: "+autorizados;
    }

    //print propietarios details en main()
    public String toString()
    {
        return this.getPropietarios() +
                " " + this.dominio;
    }


}


