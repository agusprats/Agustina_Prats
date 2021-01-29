package adaitw.java;

import java.util.List;

public class Auto extends Vehiculo {
    public Auto(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }
}
