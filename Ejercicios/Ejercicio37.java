package Ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {

        int nmin;
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
        nmin= Numeros[0];
        for(int i=0; i<10; i++){
            if(nmin>Numeros[i]){
                nmin=Numeros[i];
            }
        }


        System.out.println("El numero mas grande es " + nmax);
        System.out.println("El numero mas pequeño es " + nmin);
        lector.close();

    }
   
}
