package Strings;

public class AnalizaString {
    public static void main(String[] args) {

        String frase=Utilidades.leerCadena("Introduce una cadena de texto");
        int Nnumeros=0;
        int Nletras=0;
        int Notros=0;

        for(int i=0;i<frase.length();i++){
            char Digito=frase.charAt(i);

            if(Character.isDigit(Digito)){
                Nnumeros++;
            }else if(Character.isLetter(Digito)){
                Nletras++;
            }else {
                Notros++;
            }
        }
        System.out.println("Hay "+ Nnumeros+ " numeros, "+Nletras+" letras y " + Notros +" caracteres que no son ni numeros ni letras");
    }
}
