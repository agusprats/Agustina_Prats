package adaitw.java;

import java.util.List;

public class Colectivo extends Vehiculo {
    public Colectivo(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }
}
