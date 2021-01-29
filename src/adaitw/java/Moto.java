package adaitw.java;

import java.util.List;

public class Moto extends Vehiculo {
    public Moto(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }
}
