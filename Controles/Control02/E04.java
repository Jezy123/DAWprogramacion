package Controles.Control02;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {

        Double longitudCM;
        Double pulgadas;

        Scanner lector;
        lector= new Scanner(System.in);
        System.out.print("Ingrese longitud: ");
        longitudCM=lector.nextDouble();
        lector.close();

        pulgadas= longitudCM/2.54;
        System.out.print(longitudCM + " cm = "+ pulgadas + " in");
    }
}
