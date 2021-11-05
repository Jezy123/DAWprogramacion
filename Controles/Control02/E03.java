package Controles.Control02;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;
        
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.print("Primera nota: ");
        nota1=lector.nextInt();
        System.out.print("Segunda nota: ");
        nota2=lector.nextInt();
        System.out.print("Tercera nota: ");
        nota3=lector.nextInt();
        System.out.print("Cuarta nota: ");
        nota4=lector.nextInt();
        lector.close();

        media= (nota1 + nota2 +nota3 + nota4) /4;
        System.out.print("El promedio es: "+ media);
    }
}

        
    