/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.Thing;
import becker.robots.City;
import becker.robots.Direction;
import java.util.Random;

/**
 *
 * @author luckm
 */
public class Persona extends Thing {
   

    public Random generator = new Random();

    public Persona(City city, int x, int y, Direction drctn) {
        super(city, x, y, drctn);
        setIcon(new Bicon("persona.png"));
    }
    
    public int DestinoX(){
        int destinoX = generator.nextInt(15);
        return destinoX;
    }
    
    public int DestinoY(){
        int destinoY = generator.nextInt(15);
        return destinoY;
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
