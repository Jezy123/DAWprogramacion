package Strings;

import java.util.Scanner;

public class ContarPalabras2 {
    public static void main(String[] args) {
        int contadorDePalabras=0;
        Scanner inputValue = new Scanner(System.in);
        String frase=inputValue.nextLine();
        frase= frase+" ";
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)!=' ' && frase.charAt(1+i)==' '){
                contadorDePalabras++;
            }
        }
        System.out.println("Hay "+ contadorDePalabras +" palabras");

    }

}
