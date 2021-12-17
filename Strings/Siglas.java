package Strings;

public class Siglas {

    public static String[] palabras(String frase){
        frase=frase.trim();
    	
    	frase=frase.replaceAll(" +", " ");
    		
    	return frase.split(" "); 
    }

    public static String siglas(String[] palabras){
        String resultado="";
        for (int i=0;i<palabras.length;i++){
            String palabraauxiliar=palabras[i];
            char letra= palabraauxiliar.charAt(0);
            if(Character.isUpperCase(letra)){
                resultado=resultado+letra;
            }

        }
        return resultado;


    }

    public static void main(String[] args) {
        String frase=Utilidades.leerCadena("introduce una frase");
        String[]palabritas=palabras(frase);
        System.out.println(siglas(palabritas));

    }
}
