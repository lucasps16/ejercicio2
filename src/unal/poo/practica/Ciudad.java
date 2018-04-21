/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import java.util.ArrayList;

/**
 *
 * @author luckm
 */
public class Ciudad extends City {

    private int ancho, alto;
    private ArrayList<Persona> persona;
    private ArrayList<Car> car;

    public Ciudad(int x, int y) {
        super(x, y);
        this.car = new ArrayList<>();
        this.persona = new ArrayList<>();
    }
    
    public boolean carMasCercano(Car car){
        return false;
    }
    
    public boolean addCar(Car car){
        return false;
    }
    
    public boolean addPersona(Persona persona){
        return false;
    }
    
    //Int g = ganancias del vehiculo
    public boolean consignarGanancias(Car car, int g){
        return false;        
    }
    
    public int gananciasPlataforma(int d, int g){
        int ganancias = 0;
        
        return ganancias;
    }
            

}
