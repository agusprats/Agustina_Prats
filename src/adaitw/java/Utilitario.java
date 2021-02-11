package adaitw.java;

import java.time.LocalDate;
import java.util.List;


public class Utilitario extends Vehiculo{
    public Utilitario( Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "propietario='" + propietario + '\'' +
                //   ", direccionPropietario='" + direccion + '\'' +
                //   ", dniPropietario='" + dni + '\'' +
                ", autorizado='" + getAutorizados() + '\'' +
                //", dominio='" + dominio + '\'' +
                ", profesional=" + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                ", Fecha Cambio Titular: "+fechaCambioTitular()+
                '}';
    }
}
