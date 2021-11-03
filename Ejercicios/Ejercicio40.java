package Ejercicios;
public class Ejercicio40{
    public static void main(String[] args) {

        int n1 = 1;
        int n2= 1;
        int t;

        System.out.print("0 1 1 ");

        for(int i=3; i<=40; i++){
            t= n1+n2;
            System.out.print(t+" ");
            n1=n2;
            n2=t; 
            
        }
    }
}