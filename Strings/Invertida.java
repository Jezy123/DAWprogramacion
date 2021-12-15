package Strings;

public class Invertida {

    public static String[] palabras(String frase){
        frase=frase.trim();
    	
    	frase=frase.replaceAll(" +", " ");
    		
    	return frase.split(" ");

    }
    public static String[] invertir(String[]palabrasSueltas){
        String[]invertirArray=new String[palabrasSueltas.length];
        int x=0;
        for(int i=palabrasSueltas.length-1;i>=0;i--){
           invertirArray[x]=palabrasSueltas[i];
            x++;
        }
        return invertirArray;

    }
    public static void main(String[] args) {

        String frase=Utilidades.leerCadena("introduce una frase");

        String[]palabrasSueltas=palabras(frase);
     
        String[]invertirPalabras=invertir(palabrasSueltas);

        for (int i=0;i<invertirPalabras.length;i++){
            System.out.print(invertirPalabras[i]+" ");
        }
    }
    
}
