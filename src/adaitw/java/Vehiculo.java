package adaitw.java;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Vehiculo<camiones> {
    protected Propietario propietario;
    private List<Autorizados> autorizados;
    protected int dominio;
    protected Boolean categoriaProfesional;
    private LocalDate fechaAlta;
    protected LocalDate nuevaFecha;
    protected int cilindros;


    public Vehiculo(Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        this.propietario = propietario;
        this.autorizados = new ArrayList<>();
        this.dominio = dominio;
        this.categoriaProfesional = categoriaProfesional;
        this.fechaAlta = fechaAlta;
        this.nuevaFecha = nuevaFecha;
        this.cilindros = cilindros;
    }


    // CONSTRUCTOR ALTERNATIVO ===> Carga por defecto de categoria y fecha de ingreso a Registro
    public Vehiculo(Propietario propietario) {
        this(propietario, false, LocalDate.now());
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    //Autorizados:
    public void agregarAutorizado(Autorizados autorizados) {
        this.autorizados.add(autorizados);
    }

    public List<Autorizados> getAutorizados() {
        return autorizados;
    }

    //Categorias
    public String getCategoriaProfesional() {
        if (categoriaProfesional) {
            return " Profesional";
        } else {
            return " Particular";
        }
    }

    public void setCategoria(String categoriaProfesional) {
        if (categoriaProfesional.equalsIgnoreCase("si")) {
            this.categoriaProfesional = true;
        } else {
            this.categoriaProfesional = false;
        }
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }


    // Nuevo Propietario
    public void cambiaPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String nuevoPropietario() {
        return "El nuevo Titular del vehiculo es: " + propietario;
    }

    // Fecha de Alta de Nuevo Propietario
    public void asignarAltaNuevoTitular(LocalDate nuevaFecha) {
        this.nuevaFecha = nuevaFecha;
    }

    public String fechaCambioTitular() {
        return "Nueva Alta: " + nuevaFecha;
    }

    // DOMINIO
    /*public void cargarDominio() {
        int dominio = (int)(Math.random()*100);
        System.out.println("Dominio nª: " + dominio);
    }*/

    public int getDominio() {
        return dominio;
    }


    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }


    public String fichaTecnica() {
        return " " + propietario + " - Fecha Alta: " + fechaAlta + " - Fecha Cambio Titular: " + fechaCambioTitular();
    }

    //print propietarios details en main()
    public String toString() {
        return this.propietario +
                " " + this.dominio;
    }

}


