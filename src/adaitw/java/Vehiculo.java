package adaitw.java;
import java.time.LocalDate;
import java.util.*;
import java.time.*;

public abstract class Vehiculo {
    protected Propietario propietario;
    private List<Autorizados> autorizados;
    protected Set<Integer> dominio = new HashSet<>();
    protected Boolean categoriaProfesional;
    protected LocalDate fechaAlta;
    protected LocalDate nuevaFecha;
    protected int cilindros;
    protected LocalDate start_date;
    protected LocalDate end_date;
    protected Boolean antiguedad;

    public Vehiculo(Propietario propietario, Boolean categoriaProfesional, LocalDate fechaAlta) {
        this.propietario = propietario;
        this.autorizados = new ArrayList<>();
        this.categoriaProfesional = categoriaProfesional;
        this.fechaAlta = fechaAlta;
        this.nuevaFecha = nuevaFecha;
        this.cilindros = cilindros;
    }

    // CONSTRUCTOR ALTERNATIVO ===> Carga por defecto de categoria y fecha de ingreso a Registro
    public Vehiculo(Propietario propietario) {
        this(propietario, false, LocalDate.now());
    }

    // DOMINIO


    public Set<Integer> getDominio() {
        return dominio;
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

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    //Antiguedad desde fecha en registro
    public String antiguedad() {
        LocalDate start_date = (nuevaFecha==null) ? fechaAlta : nuevaFecha;
        LocalDate end_date = LocalDate.now();
        Period diff = Period.between(start_date, end_date);

        if(diff.getYears() == 1){
            return "Transcurrió UN AÑO desde ALTA o NUEVA ALTA: \n"+diff.getYears()+" Año - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }else{
            return "No tiene un año desde ALTA o NUEVA ALTA: \n"+diff.getYears()+" Año/s - "+diff.getMonths()+" Mes/es - "+diff.getDays()+" Dia/s ";
        }
    }

    public String fichaTecnica() {
        return " " + propietario + " - Fecha Alta: " + fechaAlta + " - Fecha Cambio Titular: " + fechaCambioTitular() +"\nTiempo desde registro: "+antiguedad();
    }

    //print propietarios details en main()
    public String toString() {
        return this.propietario +
                " " + this.getDominio();
    }

}













/*System.out.print("Tiempo transcurrido desde Alta o Cambio Titular: ");
        System.out.printf("%d years, %d months" + " and %d days ",
            diff.getYears(),
            diff.getMonths(),
            diff.getDays());

    public void setDominios(Set<Integer> dominios) {
        for(int i=001; i<100; i++)
            dominios.add(i);
        Random nuevoDominio = new Random();
        IntStream dom = nuevoDominio.ints(100, 1000, 5000);

        /*while(dominios.size()>0) {
            int dom = nuevoDominio.nextInt(dominios.size());
            System.out.println("Dominio "+dominios.add(dom));
        }*/

        //int dominio = (int)Math.floor(Math.random()*10000);
        //System.out.println("Dominio nª: " + dominio);

/*
        Random objetoAleatorio = new Random();
        int numeroRandom = objetoAleatorio.nextInt(53);
        if(numeroRandom != 0){
            System.out.println("Carta elegida: " + numeroRandom);
        }

        HashSet<String> patentes = new HashSet<>();
       if(patentes!="")
       patentes.add


        Crear un sistema que reparta las 52 cartas del mazo en pantalla.

        List<Integer> cartas = new ArrayList<>();
        for(int i=1;i<53;i++)
            cartas.add(i);

        Random objetoAleatorio = new Random();

        while(cartas.size()>0){
            int cartaElegida = objetoAleatorio.nextInt(cartas.size());
            System.out.println("Carta elegida: "+cartas.remove(cartaElegida));
        }*/
