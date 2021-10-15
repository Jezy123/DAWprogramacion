package Ejercicios;
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
       
        int[] anArray={0,0,0,0,0,0,0,0,0,0};

        Scanner lector;
        lector= new Scanner(System.in);
        System.out.println("Introduce 10 numeros");

        for(int i=0;i<10;i++){
            anArray[i]= lector.nextInt();
        }
        for(int i=9;i>0;i--){
            System.out.println(anArray[i]);
        }
        lector.close();
    }

        
        
}
