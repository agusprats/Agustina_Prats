package adaitw.java;

import java.time.LocalDate;

public class Colectivo extends Vehiculo{
    private int ejes;
    private int asientos;

    public Colectivo( Propietario propietario, int ejes, int asientos, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
        this.ejes = ejes;
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "Titularidad: " + propietario + '\'' +
                ", Autorizados: " + getAutorizados() + '\'' +
                // ", dominio='" + dominio + '\'' +
                ", Ejes: " + ejes +
                ", Cantidad Asientos: " + asientos +
                ", Categoria: " + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                '}';
    }

}
