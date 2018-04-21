
import becker.robots.*;
import unal.poo.practica.*;
import java.util.ArrayList;

public class Prueba {

    public static City objetos;
    public static RobotSE carro;

    public static void main(String[] args) {
        objetos = new City("Ciudad.txt");
        objetos.showThingCounts(true);
        carro = new Car(objetos, 0, 2, Direction.EAST, 0);
        Persona persona = new Persona(objetos, 5, 6, Direction.EAST);
        
    }
}
