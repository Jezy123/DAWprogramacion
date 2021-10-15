package Ejercicios;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        int num;
        int positivos=0;
        int finalizar=0;

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Introduce 0 para finalizar el programa");

        do  {
            System.out.println("Introduce un numero");

            num = inputValue.nextInt();

            if (num >= 0) {
            positivos = positivos + 1;
            }
            if(num==0){

                finalizar= finalizar +1;
            }
        } while (finalizar==0);

            
        

        inputValue.close();
        System.out.println("Hay " + positivos + " valores positivos");
    }
}