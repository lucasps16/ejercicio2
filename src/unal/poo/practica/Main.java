//Lucas Peña
package unal.poo.practica;

import becker.robots.*;
import becker.robots.City;
import java.util.Random;
import java.util.Scanner;
import static unal.poo.practica.Car.ganancias;


//NOTA: DEBE INGRESAR LA CANTIDAD DE VEHICULOS Y PERSONAS ANTES DE 
//OPRIMIR START EN LA VENTANA EMERJENTE.

public class Main
{    
       
        public static City objetos;
        public static RobotSE[] carro;
        public static Persona[] persona;
        public static Random generator = new Random();
        public static int personaX;
        public static int personaY;
        public static int carX;
        public static int carY;
        public static Direction direction;
        public static int ncarros;

   
        public static double gananciastot;
        
        private static double gananciasTotales(){
            gananciastot = gananciastot + ganancias;
            System.out.println("Las ganancias totales son: " + gananciastot + "pesos.");
            return gananciastot;
        }
   
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            int posCarX;
            int posCarY;
            int posPersonaX;
            int posPersonaY;
            Scanner sc =  new Scanner(System.in);
            System.out.println("Ingrese cuantos vehiculos y personas quiere: ");
            ncarros = sc.nextInt();
            int npersonas = ncarros;
            Car[] carro = new Car[ncarros];
            Persona[] persona = new Persona[npersonas];
            Thread[] hcarros = new Thread[ncarros];
           
            for (int i = 0; i < ncarros; i++) {
                posCarX = generator.nextInt(15);
                posCarY = generator.nextInt(15);
                posPersonaX =generator.nextInt(15);
                posPersonaY =generator.nextInt(15);
                
                //Determina la direccion con la cual aparecen los carros.
                if(posCarY < posPersonaY){
                    direction = Direction.SOUTH;
                } else if(posCarY > posPersonaY){
                    direction = Direction.NORTH;
                }

                
               carro[i] = new Car(objetos, posCarY, posCarX, direction, 0);  
               persona[i] = new Persona(objetos, posPersonaY, posPersonaX, Direction.NORTH);
               carro[i].setPersona(persona[i]);
               hcarros[i] = new Thread((Runnable) carro[i]);
               hcarros[i].start();
             
               
            }
            gananciasTotales();
            
	}
        
        
}

