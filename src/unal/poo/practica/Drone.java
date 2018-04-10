/*
Imagenes tomadas de:
 https://www.flaticon.com/free-icon/drone_90905
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author Fabian Giraldo
 */
public abstract class Drone extends RobotSE{
    
    public Drone(City city, int x, int y, Direction drctn, int i2, int energia) {
        super(city, x, y, drctn, i2);
        setIcon(new Bicon("drone1.png"));
    }
    
    public int medirDistancia(int x, int y){
        return 0;
    }
    
    public abstract void consumirEnergia();
    
    public void cargarEnergia(int cantidad){
        if (cantidad > 0){
            
        }
    }
    
    public void irZonaCarga(int x, int y, int distancia, int a ){
        
    }
}
