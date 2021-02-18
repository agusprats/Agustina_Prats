package adaitw.java;


import java.util.ArrayList;
import java.util.List;

public class Seccional{
    protected String codigo;
    protected String provincia;
    protected List<Vehiculo> vehiculos;
    protected List<Auto> autos ;
    protected List<Moto> motos;
    protected List<Camion> camiones;
    protected List<Colectivo> colectivos;
    protected List<Utilitario> utilitarios;
    protected List<MotoElectrica> motosElectricas;
    protected List<AutoElectrico> autosElectricos;

    public Seccional(String codigo, String provincia ) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.autos = new ArrayList<>();
        this.autosElectricos = new ArrayList<>();
        this.motos  = new ArrayList<>();
        this.motosElectricas  = new ArrayList<>();
        this.camiones  = new ArrayList<>();
        this.colectivos  = new ArrayList<>();
        this.utilitarios  = new ArrayList<>();
        this.vehiculos= new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    public String getCodigoSeccional() {
        return codigo;
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
        return motos;
    }

    public void setMoto(List<Moto> moto) {
        this.motos = moto;
    }

    public List<MotoElectrica> getMotoElectrica() {
        return motosElectricas;
    }

    public void setMotoElectrica(List<MotoElectrica> motoElectrica) {
        this.motosElectricas = motosElectricas;
    }

    public List<Camion> getCamion() {
        return camiones;
    }

    public void setCamion(List<Camion> camion) {
        this.camiones = camion;
    }

    public List<Colectivo> getColectivo() {
        return colectivos;
    }

    public void setColectivo(List<Colectivo> colectivo) {
        this.colectivos = colectivo;
    }

    public List<Utilitario> getUtilitario() {
        return utilitarios;
    }

    public void setUtilitario(List<Utilitario> utilitario) {
        this.utilitarios = utilitario;
    }

    public static Object mostrarAutos(List<AutoElectrico> autosElectricos, List<Auto> autos){
        return "Motor Eléctrico ===> "+autosElectricos+'\''+" Motor Combustión ===> " +autos;
    }

    @Override
    public String toString() {
        return "Seccional{" +
                "codigo='" + codigo + '\'' +
                ", provincia='" + provincia + '\'' +
                ", vehiculos=" + vehiculos +
                ", autos=" + autos +
                ", autoElectrico=" + autosElectricos +
                ", moto=" + motos +
                ", motoElectrica=" + motosElectricas +
                ", camion=" + camiones +
                ", colectivo=" + colectivos +
                ", utilitario=" + utilitarios +
                '}';
    }
}


