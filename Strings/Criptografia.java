package Strings;

public class Criptografia {
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
        String desencriptada="";
        for(int i=0;i<frase.length();i++){
            for(int x=0; x<alfabeto.length;x++){
                if(frase.charAt(i)==alfabeto[x]){
                    desencriptada=desencriptada+ alfabeto[()];
                    break;
                }if(frase.charAt(i)==' '){
                    desencriptada=desencriptada+' ';
                    break;
                }
            }
    
        }
        System.out.println(desencriptada);

    }
    
    
}
