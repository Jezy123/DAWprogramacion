package Ejercicios;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        
        int[] Cnota;
        int nota;
        int finalizar=0;
        
        
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("Introduce -1 para finalizar el programa");

        for (int i=0; finalizar<1 ; i++ ){

            System.out.println("Introduce un numero");
            nota=lector.nextInt();

            if (nota!=-1){
                finalizar=100;
            }else{
                int[] anArray;

                anArray= new int [i];
                anArray[i-1]=nota;
                System.out.println(anArray);
                
            
            }
            lector.close();

        
        }
    }
}


       