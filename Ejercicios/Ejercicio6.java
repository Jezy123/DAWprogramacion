package Ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        
        //Declaración de variables
        
        double radio;
        double PI;
        double area;
        double perimetro; 

        //Inicio de variables

        System.out.println("Introduce el radio");

        Scanner lector = new Scanner(System.in);
        radio = lector.nextDouble();
        lector.close();

        PI = 3.14159;
        area = PI * radio *radio;
        perimetro = 2 * radio + PI;

        System.out.println("El perimetro es de " + perimetro + " y el area es de "+ area);
      
    }
}
