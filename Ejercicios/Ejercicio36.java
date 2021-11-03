package Ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        
        int nmax;
        int nIntroducido;
        int[] Numeros;
        Numeros = new int[10];

        Scanner lector;
        lector= new Scanner(System.in);

        System.out.println("Introduce diez numeros");

        for(int i=0; i<10; i++){
            nIntroducido=lector.nextInt();
            Numeros[i]=nIntroducido;

        }
        nmax= Numeros[0];
        for(int i=0; i<10; i++){
            if(nmax<Numeros[i]){
                nmax=Numeros[i];
            }
        }
        System.out.println("El numero mas grande es " + nmax);
        lector.close();

    }
   
}
