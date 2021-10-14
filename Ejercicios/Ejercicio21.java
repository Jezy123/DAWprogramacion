package Ejercicios;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {

        int año;
        double restoaño=0;

        System.out.println("Introduce un año");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        año =inputValue.nextInt();
        inputValue.close();

        restoaño = año%4;

        if (restoaño==0){
            System.out.println("Es un añño visiesto");
        }else {
            System.out.println("No es un año visiesto");
        }
    }
}