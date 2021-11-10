package Ejercicios;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio46 {
    public static void main(String[] args) {
        int n;
        int aleatorio = (int) (Math.random() * (100 - 1 + 1) + 1);
        int FinDelJuego=0;
        System.out.println("Introduce un numero del 1 al 100 si introduces el numero-1 acaba el programa");
        Scanner lector;
        lector=new Scanner(System.in);

        do{
            n=lector.nextInt();
            if(n==-1){
                System.out.println("El jugador se rinde ");
                FinDelJuego=1;
            }
            else if(aleatorio>n){
                    System.out.println("El numero es secreto es mas grande ");
                    System.out.println("Introduce otro numero");
                }if(aleatorio<n){
                    System.out.println("El numero es secreto es mas pequeño ");
                    System.out.println("Introduce otro numero");
                }
            if(n==aleatorio){
                System.out.println("has ganado");
                FinDelJuego=1;
            }
            
        }while(FinDelJuego!=1);
        lector.close();
        


    }
    
}
