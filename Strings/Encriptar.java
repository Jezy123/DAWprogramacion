package Strings;

public class Encriptar {
    public static void main(String[] args) {
        String frase=Utilidades.leerCadena("Mete una frase a incriptar");
        int numeromagico=Utilidades.leerEntero("Introduce el numero mágico");
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String encriptada="";
        for(int i=0;i<frase.length();i++){
            for(int x=0; x<alfabeto.length;x++){
                if(frase.charAt(i)==alfabeto[x]){
                    encriptada=encriptada+ alfabeto[((x+numeromagico)%27)];
                    break;
                }if(frase.charAt(i)==' '){
                    encriptada=encriptada+' ';
                    break;
                }
            }
    
        }
        System.out.println(encriptada);

    }
}
