package Strings;

public class CompararIgnoreCase {
    public static void main(String[] args) {
        String Palabras1="Aqui hay una cadena de texto";
        String Palabras2="AQUI HAY UNA CADENA DE TEXTO EN MAYUSCULAS";
        int diferencia=Palabras1.compareToIgnoreCase(Palabras2);
        System.out.println(diferencia);
        if (diferencia>0){
            System.out.println("La primera cadena de texto es mayor lexicográficamente");
        }else if(diferencia<0){
            System.out.println("La segunda cadena de texto es mayor lexicográficamente");
        }else{
            System.out.println("Las cadenas de texto son iguales lexicográficamente");
        }

    }
    
}
