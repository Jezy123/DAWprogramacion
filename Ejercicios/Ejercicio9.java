package Ejercicios;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        //Declaracion de variables
        float edad; 

        //Inicio de programa, obtiene la  edad
        System.out.println("Introduce tu  edad");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        edad = inputValue.nextFloat();
        inputValue.close();

        //Comprueba si edad es mayor de 18
        if (edad >= 18){
            System.out.println("You have the legal age");
        }else{
            System.out.println("You are under legal age");
        }
    }
}
