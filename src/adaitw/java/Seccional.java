package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Seccional {
    private int numeroSeccional;
    private List<Moto> motos;
    private List<MotoElectrica> motosElectricas;
    private List<Auto> autos;
    private List<AutoElectrico> autosElectricos;
    private List<Camion> camiones;
    private List<Colectivo> colectivos;
    private List<Utilitario> utilitarios;

    //Constructor
    public Seccional(int numeroSeccional, List<Moto> motos, List<MotoElectrica> motosElectricas, List<Auto> autos, List<AutoElectrico> autosElectricos, List<Camion> camiones, List<Colectivo> colectivos, List<Utilitario> utilitarios) {

        this.numeroSeccional = numeroSeccional;
        this.motos = motos;
        this.motosElectricas = motosElectricas;
        this.autos = autos;
        this.autosElectricos = autosElectricos;
        this.camiones = camiones;
        this.colectivos = colectivos;
        this.utilitarios = utilitarios;

    }

    public int getNumeroSeccional() {
        return numeroSeccional;
    }

    public void setNumeroSeccional(int numeroSeccional) {
        this.numeroSeccional = numeroSeccional;
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


