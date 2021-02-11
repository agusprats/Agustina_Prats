package adaitw.java;

import java.time.LocalDate;

public class Camion extends Vehiculo{
    private int ejes;
    public Camion(Propietario propietario, int ejes, Boolean categoriaProfesional, LocalDate fechaAlta) {
        super(propietario, categoriaProfesional, fechaAlta);
        this.ejes = ejes;
    }

    public String fichaTecnica(){
        return "Propietario: "+propietario.nombre;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "Titularidad: " + propietario + '\'' +
                ", Autorizados: " + getAutorizados() + '\'' +
                // ", dominio='" + dominio + '\'' +
                ", Ejes: " + ejes +
                ", Categoria: " + getCategoriaProfesional() +
                ", Fecha Alta:" + getFechaAlta() +
                ", Fecha Cambio Titular: "+fechaCambioTitular()+
                '}';
    }

}