package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Seccional {
    private List<Moto> motos;
    private List<MotoElectrica> motosElectricas;
    private List<Auto> autos;
    private List<AutoElectrico> autosElectricos;
    private List<Camion> camiones;
    private List<Colectivo> colectivos;
    private List<Utilitario> utilitarios;

    //Constructor
    public Seccional() {
        motos = new ArrayList<>();
        motosElectricas = new ArrayList<>();
        autos = new ArrayList<>();
        autosElectricos= new ArrayList<>();
        camiones = new ArrayList<>();
        colectivos = new ArrayList<>();
        utilitarios = new ArrayList<>();
    }

    public List<Moto> getMotos() {
        return motos;
    }

    public void setMotos(List<Moto> motos) {
        this.motos = motos;
    }

    public List<MotoElectrica> getMotosElectricas() {
        return motosElectricas;
    }

    public void setMotosElectricas(List<MotoElectrica> motosElectricas) {
        this.motosElectricas = motosElectricas;
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

    public void setAutosElectricos(List<AutoElectrico> autosElectricos) {
        this.autosElectricos = autosElectricos;
    }

    public List<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(List<Camion> camiones) {
        this.camiones = camiones;
    }

    public List<Colectivo> getColectivos() {
        return colectivos;
    }

    public void setColectivos(List<Colectivo> colectivos) {
        this.colectivos = colectivos;
    }

    public List<Utilitario> getUtilitarios() {
        return utilitarios;
    }

    public void setUtilitarios(List<Utilitario> utilitarios) {
        this.utilitarios = utilitarios;
    }
}


