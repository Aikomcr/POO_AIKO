//Se importan Clases
package Figuras;
import FiguraG.*;

//Se Crea la Clase Triangulo que Hereda la clase FiguraG
public class Triangulo extends FiguraG {


    //Se declaran Variables
    private double base;
    private double altura;

    //Metodo Setter
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodo Getter

    public double Area() {
        return (base * altura) / 2;
    }
}
