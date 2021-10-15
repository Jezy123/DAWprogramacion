package Ejercicios;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        String Palabra = "";
        String Invertido = "";
        int longitud = 0;

        System.out.println("Introduce una palabra");

        Scanner lector;
        lector= new Scanner(System.in);
        Palabra = lector.nextLine();
        lector.close();

        for (int x = Palabra.length()-1; x >= 0; x--){
            Invertido = Invertido + Palabra.charAt(x);
        }

        longitud = Palabra.length()+1; 

        for (int y=0;y<longitud;y++){

            if (Palabra.charAt(y) != Invertido.charAt(y)){
                System.out.println("La palabra "+ Palabra+ " no es palindromo");
                y = Palabra.length()+100; 
            }else if(Palabra.charAt(y)==Invertido.charAt(y) &&  (Palabra.length()==y)){

                System.out.println("La palabra "+ Palabra+ " es palindromo");
            }
           
        }
       
              
    }
}

