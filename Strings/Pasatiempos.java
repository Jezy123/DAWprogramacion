package Strings;

public class Pasatiempos {
    public static void main(String[] args) {
        String frase=Utilidades.leerCadena("Introduce un mensaje");
        frase =frase.replace("a",".");
        frase =frase.replace("e",".");
        frase =frase.replace("i",".");
        frase =frase.replace("o",".");
        frase =frase.replace("u",".");
        System.out.println(frase);
        
    }
}
