package Ejercicios;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int numero;


        System.out.println("Introduce un numero");

        Scanner lector;
        lector= new Scanner(System.in);
        numero = lector.nextInt();
        lector.close();

        for(int i=1 ; i<11; i++){
            System.out.println(numero+"*"+ i +"=" +numero*i);
        }
    }
}