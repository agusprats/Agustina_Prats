package adaitw.java;

import java.util.List;


import java.time.LocalDate;

public class Auto extends Vehiculo{

    public Auto( Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Titularidad: " + propietario + '\'' +
                ", Autorizados:'" + getAutorizados() + '\'' +
                // ", dominio='" + dominio + '\'' +
                ", Categoria:" + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                '}';
    }
}
