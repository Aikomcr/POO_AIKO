package Ejecucion;

//Se importan las librerias
import java.util.Scanner;
import Figuras.*;

//Se crea la Clase Ejecucion
public class Ejecucion {

    //Metodo Main para Ejecutar
    public static void main(String[] args) {

        //declaramos variables
        int menuOpción = 0;

        //Se instancia un objeto en la clase Scanner para capturar datos
        Scanner lectura = new Scanner(System.in);

        //Ciclo While para repetir cuantas veces quiera la persona
        do{

            //Las opciones del programa
            System.out.println("¿Qué Operación desea realizar?");

            System.out.println("Area de un Triángulo : 1");

            System.out.println("Area de un Rectángulo: 2");

            System.out.println("Area de un Círculo: 3");

            System.out.println("Salir del Programa: 0");

            System.out.println("¿Qué desea Realizar?");

            System.out.print("Opción: "); menuOpción = lectura.nextInt();
            

            //condicional switch para las opciones
            switch (menuOpción) {

                case 0:

                break;

                //Caso de los triangulos
                case 1:

                System.out.println("Ingrese los siguientes datos del Triangulo: ");

                    System.out.println("Base: ");

                    double BaseT = lectura.nextDouble();

                    System.out.println("Altura: ");

                    double AlturaT = lectura.nextDouble();

                    Triangulo triangulo = new Triangulo(BaseT, AlturaT);

                    System.out.println("El área del Triángulo con base de" +BaseT+" Y Altura de: "+AlturaT+ " Es de: "+ triangulo.Area());

                    break;

                    //Caso del Rectangulo
                case 2:

                    System.out.println("Ingrese los siguientes datos del Rectangulo: ");

                    System.out.print("Base: ");

                    double BaseR = lectura.nextDouble();

                    System.out.print("Altura: ");

                    double AlturaR = lectura.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(BaseR, AlturaR);

                    System.out.println("El área del Rectangulo con base de" +BaseR+" Y Altura de: "+AlturaR+ " Es de: "+ rectangulo.Area());

                    break;

                    //Caso del Circulo

                case 3:
                    System.out.println("Ingrese los siguientes datos del Circulo: ");

                    System.out.print("Radio: ");

                    double RadioC = lectura.nextDouble();

                    Circulo circulo = new Circulo(RadioC);

                    System.out.println("El área del Círculo es: " + circulo.Area());

                    break;

                    //Caso default por si se ingresa una opcion equivocada
                default:

                    System.out.println("Error");

            }

            //condicion para repetir el ciclo
        }while(menuOpción != 0);
            
        
            
        
        lectura.close();
    }
    }

