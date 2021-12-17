package Strings;

public class Palabras1 {
    public static void main(String[] args) {
        String frase=Utilidades.leerCadena("Introduce una frase");
        String[] palabritas=Utilidades.dividirEnPalabras(frase);
        System.out.println("Hay "+ palabritas.length + " palabras");
    }
}
