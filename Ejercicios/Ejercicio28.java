package Ejercicios;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        int numero;
        double resto;
        double resultado;

        
        System.out.println("Introduce un numero");
        Scanner lector;
        lector = new Scanner(System.in);
        numero=lector.nextInt();
        lector.close();




        for(int i=2; i<(numero+1); i++){

            resto=numero%i;
            resultado=numero/i;


            if (resto ==0 && resultado==1){
                System.out.println("El numero es primo");

            }else if (resto==0 && resultado!=1){
                System.out.println("El numero no primo");
                i= numero+1;
            }
        }
        if (numero==1){
            System.out.println("El numero es primo");
        }

    }
}