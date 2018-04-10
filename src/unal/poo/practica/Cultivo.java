/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.*;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Cultivo extends City {

    private int ancho, alto;
    private ArrayList<Thing> objetos;
    private Drone[] drones;

    public Cultivo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.objetos = new ArrayList<>();
        this.drones = new Drone[2];
    }

    public boolean realizarMonitoreo(double humedad, double temp) {
        return false;
    }

    public boolean medirFertilizante(int cantidadFertilizante) {
        return false;
    }

    public boolean ponerFertilizante(int x, int y, int cantidad) {
        return false;
    }

    public boolean sembrar(double humedad, double temp, int fetilizante, int x,
            int y) {
        return false;
    }
    
    public boolean addPlanta(Planta planta){
        return false;
    }
    
    public  boolean addPanel(Panel planel){
        return false;
    }
    
    public  boolean addDrone(Drone drone){
        return false;
    }

}
