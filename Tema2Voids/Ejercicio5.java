package Tema2Voids;

import java.util.Scanner;

public class Ejercicio5 {
    public static void mayorDeTres(int []numero){
        int mayor=numero[1];
        for (int i=0;i<numero.length;i++){  
            if(numero[i]>mayor){
                mayor=numero[i];
            }
        }
        System.out.println(mayor);
    }
    public static void main(String[] args) {
        int []numero={0,0,0};
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Introduce tres numeros");
        for(int i=0;i<3;i++){
            numero[i]=lector.nextInt();          
        }
        lector.close();
        mayorDeTres(numero);
    }
    
}
