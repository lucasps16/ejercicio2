/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.City;


import static unal.poo.practica.RobotBase.carro;
import static unal.poo.practica.RobotBase.carX;
import static unal.poo.practica.RobotBase.carY;
import static unal.poo.practica.RobotBase.personaY;
import static unal.poo.practica.RobotBase.ncarros;
import static unal.poo.practica.RobotBase.personaX;
import static unal.poo.practica.RobotBase.direction;

public class Car extends RobotSE implements Runnable {

    

    private int ganancias;
    private static int recorrido = 0;
    public Car(City city, int x, int y, Direction drct, int pasajeros) {
        super(city, x, y, drct, pasajeros);
        setIcon(new Bicon("carro1.png"));
    }

    

   

    public int medirDistancia() {
        int dist;
        int distx = Math.abs(carX - personaX);
        int disty = Math.abs(carY-personaY);
        dist = distx + disty ;
        System.out.println("El vehiculo se encuentra a " + dist +" cuadras.");
        return dist;
    }
    public static Direction setDirection(){
         if(carY < personaY){
            direction = Direction.SOUTH;
        } else if(carY > personaY){
            direction = Direction.NORTH;
        } else {};
        
         if(carX < personaX){
            direction = Direction.EAST;
        } else if(carX > personaX){
            direction = Direction.WEST;
        } else {};
        
        return direction;
    }
    public static boolean irPersona(){
        int dx = personaX - carX;
        int dy = personaY - carY;
        
        for (int j = ncarros; j < 10; j++) {
            
        
            for (int i = 0; i < Math.abs(dx); i++) {
                carro[j].move();
                recorrido++;
            }
            if(carY > personaY && carX>personaX){
                carro[j].turnRight();
            } else if (carY < personaY && carX<personaX){
                carro[j].turnRight();
            } else if (carY == personaY && carX == personaX){

            }else if(carY>personaY && carX < personaX){
                carro[j].turnLeft();            
            } else if(carY<personaY && carX>personaX){
                carro[j].turnLeft();
            }
            for (int i = 0; i < Math.abs(dy); i++) {
                carro[j].move();
                recorrido++;
            }
            carro[j].pickThing();
            }
        return true;
    }
    public void cambiarColor() {
        setIcon(new Bicon("carro_ocupado.png"));
        
    }

    public double calcularGanacias() {
        double ganancias;
        ganancias = recorrido*1000;
        System.out.println("El conductor ha ganado "+ ganancias+ " pesos.");
        return ganancias;
    }

    @Override
    public void run() {
        medirDistancia();
        irPersona();
        cambiarColor();
        calcularGanacias();
        
    }
}
