package Controles.Control02;
import java.util.Scanner;
public class E09 {
    public static void main(String[] args) {

        double n1;
        double n2;
        double nL;
        double notaNecesaria;
        int notaNecesariaEntero;

        Scanner lector;
        lector =new Scanner(System.in);
        System.out.print("Ingrese nota certamen 1 :");
        n1=lector.nextInt();
        System.out.print("Ingrese nota certamen 2 :");
        n2=lector.nextInt();
        System.out.print("Ingrese nota laboratorio :");
        nL=lector.nextInt();
        lector.close();

        nL= nL*0.3;
        notaNecesaria= 60 - nL;
        notaNecesaria= notaNecesaria * 3 / 0.7;
        notaNecesaria= notaNecesaria -n1 - n2;
        notaNecesariaEntero= (int) notaNecesaria;
        System.out.print("Necesita nota " + notaNecesariaEntero+ " en el certamen 3");

    }
}


        