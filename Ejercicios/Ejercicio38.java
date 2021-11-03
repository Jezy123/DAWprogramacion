package Ejercicios;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
       
        String frase="";
        char letra;
        int contador=0;
        Scanner lector;

        System.out.println("Introduce una frase");
        
        lector=new Scanner(System.in);
        frase=lector.nextLine();

        for(int i=0; i<frase.length(); i++){
            letra=frase.charAt(i);
            if (letra=='a'|| letra=='e'|| letra=='i'|| letra=='o'|| letra=='u'){
                contador++;
            }
        }
        lector.close();
        System.out.println("apaecen " + contador + " vocales");
        

    

    }
    
}
