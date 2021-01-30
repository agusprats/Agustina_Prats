package adaitw.java;

import java.util.List;

public class Autorizado  {
    protected String nombre;
    protected String direccion;
    protected String dni;

    public Autorizado(String nombre, String direccion, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Autorizado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

