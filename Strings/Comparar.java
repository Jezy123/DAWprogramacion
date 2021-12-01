package Strings;

public class Comparar {
    public static void main(String[] args) {
        String Palabras1="aqui hay una cadena de texto";
        String Palabras2="aqui tambien hay un texto";
        int diferencia=Palabras1.compareTo(Palabras2);
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
