import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {

        //Declaracióndevariables
        double precio,  descuento , precioRebajado;
    
        //comienza  el  programa
        System.out.println("Introduce el precio");

        Scanner inputValue;
        inputValue= new Scanner(System.in);
        precio = inputValue.nextDouble();
        System.out.println("Introduce el precio ya rebajado");
    
        precioRebajado = inputValue.nextDouble();

        descuento = (precio-precioRebajado)/precio *100;
        System.out.println(descuento+"%");
        inputValue.close();
    }

}


