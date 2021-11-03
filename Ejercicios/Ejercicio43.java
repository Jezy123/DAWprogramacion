package Ejercicios;
import java.util.Scanner;
public class Ejercicio43{
    public static void main(String[] args) {
        
        int n1;
        int n2;
        Scanner lector;
        lector= new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        n1=lector.nextInt();
        n2=lector.nextInt();
        int resultado=n1;

        for (int i=1; i<n2;i++){
            if(resultado>n2){
                resultado-= n1;
            }
        }
        System.out.println(resultado);
        lector.close();

    }
}
            
