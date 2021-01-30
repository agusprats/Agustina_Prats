package adaitw.java;

import java.util.List;

public class Camion extends Vehiculo {


    public Camion(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }


    @Override
    public String toString() {
        return "Camion{" +
                "propietarios=" + getPropietarios() +
                "autorizados=" + getAutorizados() +
                ", dominio='" + dominio + '\'' +
                ", profesional=" + profesional +
                '}';
    }
}

