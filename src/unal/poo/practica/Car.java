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

    private Persona persona;
    private int ganancias;
    private static int recorrido = 0;

    public Car(City city, int y, int x, Direction drct, int pasajeros) {
        super(city, y, x, drct, pasajeros);
        setIcon(new Bicon("carro1.png"));
        this.persona = null;

    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int medirDistancia() {
        int dist;
        int disty = Math.abs(this.getStreet() - this.persona.Street());
        int distx = Math.abs(this.getAvenue() - this.persona.Avenue());
        dist = distx + disty;
        System.out.println("El vehiculo se encuentra a " + dist + " cuadras.");
        return dist;
    }
//    public static Direction setDirection(){
//         if(carY < personaY){
//            direction = Direction.SOUTH;
//        } else if(carY > personaY){
//            direction = Direction.NORTH;
//        } else {};
//        
//         if(carX < personaX){
//            direction = Direction.EAST;
//        } else if(carX > personaX){
//            direction = Direction.WEST;
//        } else {};
//        
//        return direction;
//    }

    public boolean irPersona() {
        int dx = this.persona.Street() - this.getStreet();
        int dy = this.persona.Avenue() - this.getAvenue();

        System.out.println("getAvenue: " + this.getAvenue());
        System.out.println("getStreet: " + this.getStreet());
        System.out.println("persona.Avenue: " + this.persona.Avenue());
        System.out.println("persona.Street: " + this.persona.Street());

        if (this.getAvenue() < this.persona.Avenue() && this.getStreet() < this.persona.Street()) {
            for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                recorrido++;
            }
            this.turnLeft();
        } else if (this.getAvenue() < this.persona.Avenue() && this.getStreet() > this.persona.Street()) {
            for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                recorrido++;
            }
            this.turnRight();
        }else if(this.getAvenue() > this.persona.Avenue() && this.getStreet() > this.persona.Street()){
             for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                recorrido++;
            }
            this.turnLeft();
        }else if(this.getAvenue() > this.persona.Avenue() && this.getStreet() < this.persona.Street()){
             for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                recorrido++;
            }
             this.turnRight();
        }
        for (int i = 0; i < Math.abs(dy); i++) {
            this.move();
            recorrido++;
        }
        this.pickThing();

        return true;
    }

    public void cambiarColor() {
        setIcon(new Bicon("carro_ocupado.png"));

    }

    public double calcularGanacias() {
        double ganancias;
        ganancias = recorrido * 1000;
        System.out.println("El conductor ha ganado " + ganancias + " pesos.");
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
