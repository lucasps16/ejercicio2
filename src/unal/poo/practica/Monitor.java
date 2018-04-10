/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author Estudiante
 */
public class Monitor extends Drone {

    private String tipoCamara;

    public Monitor(City city, int i, int i1, Direction drctn, int i2, int energia, String tipoCamara) {
        super(city, i, i1, drctn, i2, energia);
        this.tipoCamara = tipoCamara;
    }

    @Override
    public void consumirEnergia() {
        
    }
    
    public int realizarMonitoreo(double humedad, double temp, int x, int y){
        return 0;
    }
    
    public int medirFertilizante( int cantFertilizante, int x, int y){
        return 0;
    }
    
    public boolean ponerFertilizante(int x, int y, int cantidad){
        return false;
    }
    
    
    
    

}
