package Controles.Control02;
import java.util.Scanner;
public class E06 {
    public static void main(String[] args) {

        double nA;
        double nB;
        double hipotenusa;

        Scanner lector;
        lector= new Scanner(System.in);
        System.out.print("Ingrese cateto a: ");
        nA = lector.nextDouble();
        System.out.print("Ingrese cateto b: ");
        nB = lector.nextDouble();
        lector.close();

        hipotenusa=nA*nA+nB*nB;
        hipotenusa= Math.sqrt(hipotenusa);
        System.out.println("La hipotenusa es: "+  hipotenusa);
    }
}

        
