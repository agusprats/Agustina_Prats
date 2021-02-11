package adaitw.java;


import java.util.ArrayList;
import java.util.List;

public class Seccional{
    private String codigoSeccional;
    private String provincia;
    protected List<Vehiculo> vehiculos;
    private List<Auto> autos = new ArrayList<>();
    private List<AutoElectrico> autosElectricos= new ArrayList<>();
    private List<Moto> moto = new ArrayList<>();
    private List<MotoElectrica> motosElectricas = new ArrayList<>();
    private List<Camion> camion = new ArrayList<>();
    private List<Colectivo> colectivo = new ArrayList<>();
    private List<Utilitario> utilitario = new ArrayList<>();


    public Seccional(String codigoSeccional, String provincia ) {
        this.codigoSeccional = codigoSeccional;
        this.provincia = provincia;
        this.autos = autos;
        this.autosElectricos = autosElectricos;
        this.moto = moto;
        this.motosElectricas = motosElectricas;
        this.camion = camion;
        this.colectivo = colectivo;
        this.utilitario = utilitario;
        this.vehiculos= new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public String getCodigoSeccional() {
        return codigoSeccional;
    }

    public String getProvincia() {
        return provincia;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<AutoElectrico> getAutosElectricos() {
        return autosElectricos;
    }

    public void setAutoElectrico(List<AutoElectrico> autosElectricos) {
        this.autosElectricos = autosElectricos;
    }

    public List<Moto> getMoto() {
        return moto;
    }

    public void setMoto(List<Moto> moto) {
        this.moto = moto;
    }

    public List<MotoElectrica> getMotoElectrica() {
        return motosElectricas;
    }

    public void setMotoElectrica(List<MotoElectrica> motoElectrica) {
        this.motosElectricas = motosElectricas;
    }

    public List<Camion> getCamion() {
        return camion;
    }

    public void setCamion(List<Camion> camion) {
        this.camion = camion;
    }

    public List<Colectivo> getColectivo() {
        return colectivo;
    }

    public void setColectivo(List<Colectivo> colectivo) {
        this.colectivo = colectivo;
    }

    public List<Utilitario> getUtilitario() {
        return utilitario;
    }

    public void setUtilitario(List<Utilitario> utilitario) {
        this.utilitario = utilitario;
    }

    /*public String mostrarAutos() {
        System.out.println("Autos Consumo Combustión: " + autos+ "Autos Consumo Eléctrico: " + autosElectricos);
    }

        System.out.println("Fecha Alta: " + fecha);
        System.out.println("Fecha Ultima Transferencia: " + fechaTranf);
        System.out.println("Cedula Verde Vencida: " + (pasoMasde1AnioUltimoTitular() ? "Si" : "No"));
        System.out.println("Titular: " + propietario.getNombre());
        System.out.println("Uso: " + (usoParticular ? "Particular" : "Profesional"));
        System.out.println("Tipo: " + tipo);
        System.out.println("Electrico: " + (esElectrico ? "Si" : "No"));
        System.out.println("Autorizados: " + autorizados.size() + " conductor/es");*/


    @Override
    public String toString() {
        return "Seccional{" +
                "codigoSeccional='" + codigoSeccional + '\'' +
                ", provincia='" + provincia + '\'' +
                ", vehiculos=" + vehiculos +
                ", autos=" + autos +
                ", autoElectrico=" + autosElectricos +
                ", moto=" + moto +
                ", motoElectrica=" + motosElectricas +
                ", camion=" + camion +
                ", colectivo=" + colectivo +
                ", utilitario=" + utilitario +
                '}';
    }
}


