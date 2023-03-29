package Salud;

import java.util.Scanner;

public class Paciente {
    //atributos

   private int identificacion;
   private String nombrePaci;
   private String apellidoPaci;
   private int edadPaci;

    //métodos
   

    public void solicitarDatos(){
        
    Scanner lectura = new Scanner(System.in);

    System.out.println("Por favor ingresarlos siguientes datos ");

    System.out.println("ingrese su número de identificación");
    identificacion= lectura.nextInt();

    
    System.out.println("ingrese su nombre");
    nombrePaci = lectura.nextLine();

    
    System.out.println("ingrese su apellido");
    apellidoPaci = lectura.nextLine();

    
    System.out.println("ingrese su nombre");
    edadPaci = lectura.nextInt();


 }
}
