package Strings;


public class Digitos {

    public static void main(String[] args) {
        String frase= Utilidades.leerCadena("Introduce una frase con numeros");
        frase= frase.toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz ,;.".toCharArray();
        int NumDeNum=frase.length();
        for (int i=0; i<frase.length();i++){
            for (int x=0;x<alphabet.length;x++){
                if(frase.charAt(i)== alphabet[x]){
                    NumDeNum--;
                }   
            }
        }
        System.out.println("Hay un total de "+ NumDeNum+" digitos");
    }
    
}
