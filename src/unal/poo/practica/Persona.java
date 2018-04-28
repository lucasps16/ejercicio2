/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.Thing;
import becker.robots.City;
import becker.robots.Direction;

/**
 *
 * @author luckm
 */
public class Persona extends Thing {
   

    

    public Persona(City city, int x, int y, Direction drctn) {
        super(city, x, y, drctn);
        setIcon(new Bicon("persona.png"));
    }
    
    public boolean Destino(int y, int x){
        
        return false;
    }
    
    public int Street(){
        int street = this.getIntersection().getStreet();
        return street;
    }
    
    public int Avenue(){
        int avenue = this.getIntersection().getAvenue();
        return avenue;
    }
    
    
}
