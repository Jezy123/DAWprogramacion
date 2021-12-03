package Strings;

public class Contains {
    public static void main(String[] args) {
        String Texto1="Hola Mundo";
        String Texto2="Hola";
        String Texto3="hello";
        
        System.out.println(Texto1.contains(Texto2));
        System.out.println(Texto1.contains(Texto3));
        System.out.println(Texto1.contains("Mundo"));
    }
    
}
