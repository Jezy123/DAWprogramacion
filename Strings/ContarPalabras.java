package Strings;

public class ContarPalabras {
    public static void main(String[] args) {
        String frase=Utilidades.leerCadena("Introduce una frase");
        String Palabras[]=Utilidades.dividirEnPalabras(frase);
        System.out.println(Palabras.length);
    }
    
}
