package Controles.Control02;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {

        Double radio;
        Double PI= 3.14159;
        Scanner lector;

        lector=new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio=lector.nextDouble();

        System.out.println("Perimetro: "+ 2*PI*radio);
        System.out.println("Área: "+ PI*radio*radio);
        lector.close();
    }
}
