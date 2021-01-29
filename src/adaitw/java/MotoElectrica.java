package adaitw.java;

import java.util.List;

public class MotoElectrica extends Vehiculo {
    public MotoElectrica(List<Propietario> propietarios, List<Autorizado> autorizados, String dominio, Boolean profesional) {
        super(propietarios, autorizados, dominio, profesional);
    }
}
