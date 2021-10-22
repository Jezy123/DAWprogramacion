package Ejercicios;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        int nota;
        int maxnota=0;
        int media=0;
        int finalizar=0;
        int repeticiones= 0;
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        System.out.println("Introduce -1 para finalizar el programa");

        do {

            System.out.println("Introduce una nota");
    
            nota = inputValue.nextInt();

            if (nota == -1){
                finalizar++;

            }else{
                media=media + nota;
                repeticiones++;

                if(nota==10){
                    maxnota++;
                }

            }

        }while (finalizar==0);

        inputValue.close();
        if(media==0){
            System.out.println("Tu media es de 0 y has sacado un 10 " + maxnota + "veces");
        }else{ 
            System.out.println("Tu media es de " + media/repeticiones + " y has sacado un 10 " + maxnota + "veces");}
    }
}
