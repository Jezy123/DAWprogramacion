package Ejercicios;
import java.util.Scanner;
public class Ejercicio43{
    public static void main(String[] args) {
        
        int n1;
        int n2;
        Scanner lector;
        int i=1;
        lector= new Scanner(System.in);
        

        System.out.println("Introduce dos numeros");
        n1=lector.nextInt();
        n2=lector.nextInt();

        lector.close();


        for (i =1;n1>n2;i++){
            if(n1>n2){
                n1= n1 - n2;
            }
        }
        System.out.println(i);
        System.out.println(n1);
        

    }
}
            
