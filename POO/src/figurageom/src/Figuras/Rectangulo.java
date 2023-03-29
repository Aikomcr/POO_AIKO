//Se Importan Clases
package Figuras;
import FiguraG.*;

//Se Crea la clase Rectangulo Heredada de la clase Figura G
public class Rectangulo extends FiguraG {

    //Se declaran Variables
    private double base;
    private double altura;

    //Metodo Getter
    public Rectangulo(double base, double altura) {

        this.base = base;

        this.altura = altura;
    }

    //Metodo Setter
    public double Area() {
        return (base * altura);
    }
}
