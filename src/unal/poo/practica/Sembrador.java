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
public class Sembrador extends Drone{
    private int semillas;

    public Sembrador(City city, int i, int i1, Direction drctn, int i2, int energia, int semillas) {
        super(city, i, i1, drctn, i2, energia);
        this.semillas = semillas;
        setIcon(new Bicon("drone.png"));
    }

    @Override
    public void consumirEnergia() {
        
    }
    
    public boolean sembrar(Planta planta){
        return false;
    }
}
