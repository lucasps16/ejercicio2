package unal.poo.practica;

import becker.robots.*;
import becker.robots.City;
import java.util.Random;
import java.util.Scanner;


//NOTA: DEBE INGRESAR LA CANTIDAD DE VEHICULOS Y PERSONAS ANTES DE 
//OPRIMIR START EN LA VENTANA EMERJENTE.

public class RobotBase
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
   
	public static void main (String[] args) throws InterruptedException{
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
            objetos.showThingCounts(true);
            int posCarX;
            int posCarY;
            int posPersonaX;
            int posPersonaY;
            Scanner sc =  new Scanner(System.in);
            System.out.println("Ingrese cuantos vehiculos quiere: ");
            ncarros = sc.nextInt();
            System.out.println("Ingrese cuantas personas quiere: ");
            int npersonas = sc.nextInt();
            Car[] carro = new Car[ncarros];
            Persona[] persona = new Persona[npersonas];
           Thread[] hcarros = new Thread[ncarros];
           
            for (int i = 0; i < ncarros; i++) {
                posCarX =1; // generator.nextInt(15);
                posCarY =8; // generator.nextInt(15);
                posPersonaX =6; //generator.nextInt(15);
                posPersonaY =6; //generator.nextInt(15);
                
                //Determina la direccion con la cual aparecen los carros.
                if(posCarY < posPersonaY){
                    direction = Direction.SOUTH;
                } else if(posCarY > posPersonaY){
                    direction = Direction.NORTH;
                }
//                if(posCarX < posPersonaX){
//                    direction = Direction.EAST;
//                } else if(posCarX > posPersonaX){
//                    direction = Direction.WEST;
//                }
                
                carro[i] = new Car(objetos, posCarY, posCarX, direction, 0);  
               persona[i] = new Persona(objetos, posPersonaY, posPersonaX, Direction.NORTH);
               carro[i].setPersona(persona[i]);
               hcarros[i] = new Thread((Runnable) carro[i]);
               hcarros[i].start();
             
               
            }
            
	}  
}

