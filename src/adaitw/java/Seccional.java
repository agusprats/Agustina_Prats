package adaitw.java;


import java.util.ArrayList;
import java.util.List;

public class Seccional{
    protected String codigo;
    protected String provincia;
    protected List<Vehiculo> vehiculos;
    protected List<Auto> autos ;
    protected List<Moto> moto;
    protected List<Camion> camion;
    protected List<Colectivo> colectivo;
    protected List<Utilitario> utilitario;
    protected List<MotoElectrica> motosElectricas;
    protected List<AutoElectrico> autosElectricos;

    public Seccional(String codigo, String provincia ) {
        this.codigo = codigo;
        this.provincia = provincia;
        this.autos = new ArrayList<>();
        this.autosElectricos = new ArrayList<>();
        this.moto  = new ArrayList<>();
        this.motosElectricas  = new ArrayList<>();
        this.camion  = new ArrayList<>();
        this.colectivo  = new ArrayList<>();
        this.utilitario  = new ArrayList<>();
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

    public static Object mostrarAutos(List<AutoElectrico> autosElectricos, List<Auto> autos){
        return "Motor Eléctrico ===> "+autosElectricos+'\''+" Motor Combustión ===> " +autos;
    }

    @Override
    public String toString() {
        return "Seccional{" +
                "codigoSeccional='" + codigo + '\'' +
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


