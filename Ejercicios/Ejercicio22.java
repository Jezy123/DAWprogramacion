package Ejercicios;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        int num;
        int positivos=0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");

            num = inputValue.nextInt();

            if (num >= 0) {
            positivos = positivos + 1;
            }
            
        }

        inputValue.close();
        System.out.println("Hay " + positivos + " valores positivos");
    }
}