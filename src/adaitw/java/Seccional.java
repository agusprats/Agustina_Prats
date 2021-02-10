package adaitw.java;


import java.util.ArrayList;
import java.util.List;

public class Seccional{
    private String codigoSeccional;
    private String provincia;
    protected List<Vehiculo> vehiculos;
    private List<Auto> autos = new ArrayList<>();
    private List<AutoElectrico> autoElectrico= new ArrayList<>();
    private List<Moto> moto = new ArrayList<>();
    private List<MotoElectrica> motoElectrica = new ArrayList<>();
    private List<Camion> camion = new ArrayList<>();
    private List<Colectivo> colectivo = new ArrayList<>();
    private List<Utilitario> utilitario = new ArrayList<>();

    public Seccional(String codigoSeccional, String provincia ) {
        this.codigoSeccional = codigoSeccional;
        this.provincia = provincia;
        this.autos = autos;
        this.autoElectrico = autoElectrico;
        this.moto = moto;
        this.motoElectrica = motoElectrica;
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

    public List<AutoElectrico> getAutoElectrico() {
        return autoElectrico;
    }

    public void setAutoElectrico(List<AutoElectrico> autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    public List<Moto> getMoto() {
        return moto;
    }

    public void setMoto(List<Moto> moto) {
        this.moto = moto;
    }

    public List<MotoElectrica> getMotoElectrica() {
        return motoElectrica;
    }

    public void setMotoElectrica(List<MotoElectrica> motoElectrica) {
        this.motoElectrica = motoElectrica;
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

    @Override
    public String toString() {
        return "Seccional{" +
                "codigoSeccional='" + codigoSeccional + '\'' +
                ", provincia='" + provincia + '\'' +
                ", vehiculos=" + vehiculos +
                ", autos=" + autos +
                ", autoElectrico=" + autoElectrico +
                ", moto=" + moto +
                ", motoElectrica=" + motoElectrica +
                ", camion=" + camion +
                ", colectivo=" + colectivo +
                ", utilitario=" + utilitario +
                '}';
    }
}


