package Ejercicios;
public class Ejercicio41{
    public static void main(String[] args) {

        double n1 = 1;
        double n2= 1;
        double t;
        double aureo;


        for(int i=3; i<=40; i++){
            t= n1+n2;
            aureo= t/n2;
            System.out.println(aureo);
            n1=n2;
            n2=t; 
            
        }
    }
}