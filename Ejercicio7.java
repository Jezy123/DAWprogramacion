import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        float precio;
        float descuento;
        float precioRebajado;

        System.out.println("Introduce el precio");

        Scanner inputValue;
        inputValue= new Scanner(System.in);
        precio = inputValue.nextFloat();
        System.out.println("Introduce el precio ya rebajado");
    
        precioRebajado = inputValue.nextFloat();

        descuento = (precio-precioRebajado)/precio *100;
        System.out.println(descuento+"%");
        inputValue.close();
    }

}


