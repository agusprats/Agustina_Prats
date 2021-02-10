package adaitw.java;

import java.time.LocalDate;

public class Colectivo extends Vehiculo{
    private int ejes;

    public Colectivo( Propietario propietario, int ejes, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
        this.ejes = ejes;
    }



}
