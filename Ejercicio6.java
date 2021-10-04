import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {

        float radio;
        double pi;
        double area;
        double perimetro; 

        System.out.println("Introduce el radio");

        Scanner inputValue;
        inputValue= new Scanner(System.in);
        radio = inputValue.nextFloat();
        inputValue.close();

        pi = 3.14159;
        area = pi * radio *radio;
        perimetro = 2 * radio + pi;

        System.out.println("El perimetro es de " + perimetro + " y el area es de "+ area);
      
    }
}
