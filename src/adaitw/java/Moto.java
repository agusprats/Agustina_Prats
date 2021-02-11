package adaitw.java;

import java.time.LocalDate;

public class Moto extends Vehiculo{
    public Moto( Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario,categoriaProfesional, fechaAlta);
    }

    @Override
    public String toString() {
        return "Moto{" +
                "Propietario: " + propietario + '\'' +
                ", Autorizados:'" + getAutorizados() + '\'' +
                ", dominio='" + getDominio() + '\'' +
                ", Categoria:" + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                ", Fecha Cambio Titular: "+fechaCambioTitular()+
                '}';
    }
}
