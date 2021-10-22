package Ejercicios;
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        int numero;
        int factorial;

        System.out.println("Introduce un numero");

        Scanner lector;
        lector= new Scanner(System.in);
        numero = lector.nextInt() ;
        factorial = numero;


        while (numero>1){
            numero= numero -1;
            factorial= factorial * numero;

        }
        if (numero>1){
            System.out.println("Su factorial es "+ factorial);
        }
        lector.close();
    }
}