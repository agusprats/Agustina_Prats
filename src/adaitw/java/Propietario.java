package adaitw.java;


public class Propietario {
    protected String nombre;
    protected String direccion;
    protected String dni;



    public Propietario(String nombre, String direccion, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    //Constructor opcional. Carga por defecto ante falta de información:
    public Propietario(String nombre){
        this(nombre, "Sin datos", "Sin datos" );
    }

    public String getPropietario() {
        return nombre;
    }

    public void setPropietario(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String fichaTitular(){
        return "Propietario: "+nombre+" Documento - CUIT: "+dni;
    }



    //print propietarios details en main()
    public String toString()
    {
        return "Propietario: "+this.nombre +
                " - DNI/CUIT:  " + this.dni; //+
        // " - Domicilio:  " + this.direccion;

    }

}

