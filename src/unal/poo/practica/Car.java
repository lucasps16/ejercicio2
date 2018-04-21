/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.City;

public class Car extends RobotSE implements Runnable {

    private int ganancias;

    public Car(City city, int x, int y, Direction drct, int pasajeros) {
        super(city, x, y, drct, pasajeros);
        setIcon(new Bicon(""));
    }

    public int medirDistancia(int x, int y) {
        return 0;
    }

    public boolean cambiarColor() {
        setIcon(new Bicon("ocupado.png"));
        return false;
    }

    public int calcularGanacias() {
        return 0;
    }

    @Override
    public void run() {
        
    }
}
