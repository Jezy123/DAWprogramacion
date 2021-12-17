package Strings;

public class Alfabetica {
    public static void main(String[] args) {
        String palabra=Utilidades.leerCadena("Introduce una palabra");
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int posicion=-1;
        int esAlfa=0;

        for (int i=0;i<palabra.length();i++){
            if(esAlfa!=0){
                break;
            }

            for(int x=0;x<alfabeto.length;x++){

                if(palabra.charAt(i)==alfabeto[x]){
                    if(posicion<x){
                        posicion=x;
                    }else{
                        System.out.println("No es alfabética");
                        esAlfa--;
                        break;
                    }    
                        
                        
                }
            }
        }
        if(esAlfa==0){
            System.out.println("La palabra es alabética");
        }
        
    }
}
