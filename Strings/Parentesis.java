package Strings;

public class Parentesis {
    public static void main(String[] args) {
        String frase= Utilidades.leerCadena("Introduce una frase");
        int numDeParentesis=0;
        for (int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='('){
                numDeParentesis++;
            }
            if(frase.charAt(i)==')'){
                numDeParentesis--;
            }
            if(numDeParentesis==-1){
                System.out.println("La frase esta mal parentizada");
                break;
            }
        }
        if(numDeParentesis<0){
            System.out.println("La frase esta mal parentizada");
        }
        if(numDeParentesis==0){
            System.out.println("La frase esta bien parentizada");
        }
        
    }
}
