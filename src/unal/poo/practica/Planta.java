package unal.poo.practica;

import becker.robots.Thing;
import becker.robots.City;

public class Planta extends Thing {

     private int temp, humedad, fert;
     private String color;

    public Planta(City city, int i, int i1, int temp, int humedad, int fert) {
        super(city, i, i1);
        this.temp = temp;
        this.humedad = humedad;
        this.fert = fert;

        setIcon(new Bicon("coffee.png"));
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public boolean adicionarFertilizante(int cantida) {
        return false;
    }

    public boolean cambiarColor() {
        return false;
    }

}
