package Strings;

public class Comparar {
    public static void main(String[] args) {
        String Palabras1=Utilidades.leerCadena("introduce palabra1");
        String Palabras2=Utilidades.leerCadena("introduce palabra2");
        int diferencia=Palabras1.compareTo(Palabras2);
        System.out.println(diferencia);
        if (diferencia>0){
            System.out.println("La primera cadena de texto es mayor lexicogr√°ficamente");
        }else if(diferencia<0){
            System.out.println("La segunda cadena de texto es mayor lexicogr√°ficamente");
        }else{
            System.out.println("Las cadenas de texto son iguales lexicogr√°ficamente");
        }


       
    }
}
