package Controles.Control02;
import java.util.Scanner;
public class E08 {
    public static void main(String[] args) {

        double n1;
        int nEntero;
        

        Scanner lector;
        lector=new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        n1=lector.nextDouble();
        lector.close();

        nEntero=(int) n1;
        if(n1>0){
            System.out.println(n1-nEntero);
        }else{
            System.out.println((n1-nEntero)*-1);
        }
    }
}