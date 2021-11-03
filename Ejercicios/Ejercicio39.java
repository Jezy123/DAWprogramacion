package Ejercicios;
import java.util.Scanner;
public class Ejercicio39{
    public static void main(String[] args) {
        
        int nNatural;
        Scanner lector;
        lector= new Scanner(System.in);

        System.out.println("Introduce un  numero natural");
        nNatural=lector.nextInt();

        for (int i=1; i<nNatural;i++){
            
            int resto = nNatural%i;
            if(resto==0){
                System.out.print(i+" ");
            }
        }
        if(nNatural==0){
        System.out.println("Has introducido el 0");
        }
        lector.close();
    }
}