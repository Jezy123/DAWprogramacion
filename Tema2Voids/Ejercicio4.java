package Tema2Voids;
import java.util.Scanner;


public class Ejercicio4 {
    public  static void positivos(int []numeros){
        int xPos=0;
        for (int i=0;i<numeros.length-1;i++){
            if(numeros[i]>0){
                xPos++;
            }
        }
        System.out.println("Hay un total "+ xPos +" positivos");
    }
    
    public static void main(String[] args) {
        int [] numeros;
        numeros= new int[10];
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Introduce 10 numeros");
        for(int i=0;i<10;i++){
            numeros[i]=lector.nextInt();          
        }
        lector.close();
        positivos(numeros);
    }
}
