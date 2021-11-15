package Tema2Voids;

import java.util.Scanner;

public class Ejercicio2 {
    public static void descendente(int x , int y){
        if(x>y){
            System.out.println(x);
            System.out.println(y);
        }else{
            System.out.println(x);
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        int x;
        int y;
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.println("Introduze un numero x");
        x=lector.nextInt();
        System.out.println("Introduze un numero y");
        y=lector.nextInt();
        descendente(x, y);
        lector.close();
    }
    
}
