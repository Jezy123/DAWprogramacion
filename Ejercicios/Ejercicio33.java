package Ejercicios;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
       
        char[] Letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int DNI;



        Scanner lector;
        System.out.println("Introducetu DNI sin la letra");
        lector=new Scanner(System.in);
        DNI= lector.nextInt();
        lector.close();


        System.out.println(Letras[DNI%23]);

    }
}