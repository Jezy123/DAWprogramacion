package Ejercicios;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {

        double precio;
        double descuento=0;

        System.out.println("Introduce el precio");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio =inputValue.nextDouble();
        inputValue.close();

        if (precio>=6){
            System.out.println("No hay descuento al precio actual");
        } else if (precio>=60){
            descuento = precio * 0.05;
            System.out.println("El descuento es de" + descuento);
        } else if (precio<60){
            descuento = precio * 0.10;
            System.out.println("El descuento es de" + descuento);
        }
    }
    
}