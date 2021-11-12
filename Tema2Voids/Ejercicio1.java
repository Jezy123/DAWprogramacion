package Tema2Voids;
import java.util.Scanner;
public class Ejercicio1 {
    public static void mayor(int x){
        if(x>=18){
            System.out.println("Eres mayor de edad");
          
        }
        
    } 
    
    public static void main(String[] args) {
        int x=0;
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Introduze tu edad");
        x=lector.nextInt();
        lector.close();
        mayor(x);
    }
         
    
}
