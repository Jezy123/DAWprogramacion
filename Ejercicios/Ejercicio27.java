package Ejercicios;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        int numero;
        String Lista="";


        System.out.println("Introduce un numero");

        Scanner lector;
        lector= new Scanner(System.in);
        numero = lector.nextInt();
        numero++;
        lector.close();

        for(int i=1 ; i<numero; i++){
            Lista  = Lista +" "+ String.valueOf(i);
            System.out.println(Lista);
        }
    }
}