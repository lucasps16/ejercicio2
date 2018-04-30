//Lucas Peña
package unal.poo.practica;

import becker.robots.RobotSE;
import becker.robots.Direction;
import becker.robots.City;
import static unal.poo.practica.Main.direction;


public class Car extends RobotSE implements Runnable {

    private Persona persona;
    public static int ganancias;
    private static int recorrido = 0;

    public Car(City city, int y, int x, Direction direction, int pasajeros) {
        super(city, y, x, direction, pasajeros);
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
    public Direction setDirection(){
        
       
        if(this.getStreet() < this.persona.DestinoX()){
            
            direction = Direction.EAST;
        } else if(this.getStreet() > this.persona.DestinoX()){
            
            direction = Direction.WEST;
        } else {
             
        }
        
        return direction;
    }

    public boolean irPersona() {
        int dx = this.persona.Street() - this.getStreet();
        int dy = this.persona.Avenue() - this.getAvenue();

        if (this.getAvenue() < this.persona.Avenue() && this.getStreet() < this.persona.Street()) {
            for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                
            }
            this.turnLeft();
        } else if (this.getAvenue() < this.persona.Avenue() && this.getStreet() > this.persona.Street()) {
            for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                
            }
            this.turnRight();
        }else if(this.getAvenue() > this.persona.Avenue() && this.getStreet() > this.persona.Street()){
             for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                
            }
            this.turnLeft();
        }else if(this.getAvenue() > this.persona.Avenue() && this.getStreet() < this.persona.Street()){
             for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                
            }
             this.turnRight();
        } else if(this.getAvenue() == this.persona.Avenue() || this.getStreet() == this.persona.Street()){
             for (int i = 0; i < Math.abs(dx); i++) {
                this.move();
                
            }
        }
        for (int i = 0; i < Math.abs(dy); i++) {
            this.move();
            
        }
        this.pickThing();
        
        return true;
    }
    
    public boolean irDestino(){
        System.out.println("Destino: Calle "+ this.persona.DestinoX()+ " - Avenida "+ this.persona.DestinoY());
        int xi = this.persona.DestinoX() - this.getStreet();
        int yi = this.persona.DestinoY() - this.getAvenue();
        
        
        
         if (this.getAvenue() < this.persona.DestinoY() && this.getStreet() < this.persona.DestinoX()) {
            for (int i = 0; i < Math.abs(xi); i++) {
                this.move();
                recorrido ++;
            }
            this.turnLeft();
        } else if (this.getAvenue() < this.persona.DestinoY() && this.getStreet() > this.persona.DestinoX()) {
            for (int i = 0; i < Math.abs(xi); i++) {
                this.move();
                recorrido ++;
            }
            this.turnRight();
        }else if(this.getAvenue() > this.persona.DestinoY() && this.getStreet() > this.persona.DestinoX()){
             for (int i = 0; i < Math.abs(xi); i++) {
                this.move();
                recorrido++;
            }
            this.turnLeft();
        }else if(this.getAvenue() > this.persona.DestinoY() && this.getStreet() < this.persona.DestinoX()){
             for (int i = 0; i < Math.abs(xi); i++) {
                this.move();
                recorrido++;
            }
             this.turnRight();
        }
        for (int i = 0; i < Math.abs(yi); i++) {
            this.move();
            recorrido++;
        }
        this.putAllThings();
        setIcon(new Bicon("carro1.png"));
        return true;        
    }

    public void cambiarColor() {
        setIcon(new Bicon("carro_ocupado.png"));

    }

    public double calcularGanacias() {
        double ganancias;
        ganancias = (recorrido * 1000)/2;
        System.out.println("El conductor ha ganado " + ganancias + " pesos.");
        
        return ganancias;
    }
    
   
    
    

    @Override
    public void run() {
        medirDistancia();
        irPersona();
        cambiarColor();
        setDirection();
        irDestino();
        calcularGanacias();
    }
}

   
