package adaitw.java;


import java.util.ArrayList;
import java.util.List;

public class Seccional{
    private String codigoSeccional;
    private String provincia;
    protected List<Vehiculo> vehiculos;
    protected List<Auto> autos = new ArrayList<>();
    protected List<Moto> moto = new ArrayList<>();
    protected List<Camion> camion = new ArrayList<>();
    protected List<Colectivo> colectivo = new ArrayList<>();
    protected List<Utilitario> utilitario = new ArrayList<>();
    protected List<MotoElectrica> motosElectricas = new ArrayList<>();
    protected List<AutoElectrico> autosElectricos= new ArrayList<>();

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

    public static Object mostrarAutos(List<AutoElectrico> autosElectricos, List<Auto> autos){
        return "Autos Motor Eléctrico ===> "+autosElectricos+'\''+" Autos Motor Combustión ===> " +autos;
    }

    public String MostrarAutos() {
        return "Autos Motor Combustión: "+autos+'\''+" Autos Motor Eléctrico : " +autosElectricos;
    }

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


