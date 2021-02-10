package adaitw.java;

import java.time.LocalDate;

public class MotoElectrica extends Vehiculo{
    public MotoElectrica( Propietario propietario,  Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
    }

    @Override
    public String toString() {
        return "Moto Electrica{" +
                "Propietario: " + propietario + '\'' +
                //", Direccion: " + direccion + '\'' +
                //", DNI: " + dni + '\'' +
                ", Autorizados:'" + getAutorizados() + '\'' +
                // ", dominio='" + dominio + '\'' +
                ", Categoria:" + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                '}';
    }
}
