package adaitw.java;

public class Autorizados extends Propietario{

    public Autorizados(String nombre, String direccion, String dni) {
        super(nombre, direccion, dni);
    }

    @Override
    public String toString() {
        return "{" +
                "Nombre: " + nombre + '\'' +
                // ", direccion='" + direccion + '\'' +
                ", DNI: " + dni + '\'' +
                '}';
    }
}
