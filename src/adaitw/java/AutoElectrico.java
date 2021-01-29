package adaitw.java;

import java.util.List;

public class AutoElectrico extends Vehiculo {
    public AutoElectrico(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }
}
