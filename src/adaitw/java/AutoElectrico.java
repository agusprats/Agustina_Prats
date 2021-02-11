package adaitw.java;


import java.time.LocalDate;

public class AutoElectrico extends Vehiculo{
    public AutoElectrico( Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
    }

    @Override
    public String toString() {
        return "Auto Electrico{" +
                "Propietario: " + propietario + '\'' +
                // ", Direccion: " + direccion + '\'' +
                //  ", DNI: " + dni + '\'' +
                ", Autorizados:'" + getAutorizados() + '\'' +
                // ", dominio='" + dominio + '\'' +
                ", Categoria:" + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                ", Fecha Cambio Titular: "+fechaCambioTitular()+
                '}';
    }
}

