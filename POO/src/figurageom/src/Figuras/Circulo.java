//Se importan Clases
package Figuras;
import FiguraG.*;

//Se crea la clase heredada de la clase FiguraG
public class Circulo extends FiguraG {

    //Se declaran Variables
    private double radio;

    //Metodo Setters

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Metodo Getter

    public double Area() {
        return Math.pow(radio, 2)*3.1416;
    }
}

