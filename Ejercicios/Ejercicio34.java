package Ejercicios;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
       
        char[] ILetras={'X','Y','Z'};
        char[] FLetras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
        int Nie;

        Scanner lector;
        System.out.println("Introducetu Nie sin la letra");
        lector=new Scanner(System.in);
        Nie= lector.nextInt();
        lector.close();


        System.out.println(FLetras[Nie%23]);
        System.out.println(ILetras[Nie%3]);
    }
}