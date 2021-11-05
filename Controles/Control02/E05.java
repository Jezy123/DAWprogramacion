package Controles.Control02;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {

        String numero="";
        String invertido="";

        Scanner lector;
        lector = new Scanner(System.in);
        System.out.print("Ingrese numero: ");
        numero=lector.nextLine();

        for (int i = numero.length()-1; i >= 0; i--){
            invertido = invertido + numero.charAt(i);
        }

        lector.close();
        System.out.println(invertido);


    }
}
