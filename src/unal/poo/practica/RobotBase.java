package unal.poo.practica;

import becker.robots.*;
import becker.robots.City;
import java.util.Random;
import java.util.Scanner;
import static unal.poo.practica.Car.setDirection;

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
            Scanner sc =  new Scanner(System.in);
            System.out.println("Ingrese cuantos vehiculos quiere: ");
            ncarros = sc.nextInt();
            System.out.println("Ingrese cuantas personas quiere: ");
            int npersonas = sc.nextInt();
            setDirection();
            
            for (int i = 0; i < ncarros; i++) {
                int cx = generator.nextInt(15);
                int cy = generator.nextInt(15);
                carX = cx;
                carY = cy;
                carro[i] = new Car(objetos, carY, carX, direction, 0);
                Thread car = new Thread((Runnable) carro[i]);
            }
            
            for (int i = 0; i < npersonas; i++) {
               
            }
            
            
//            
	}
        
        
        
       
}

