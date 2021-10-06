import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        float numero;

        //Inicio de programa y obtencion del numero
        System.out.println("Introduce un numero positivo o negativo");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        numero = inputValue.nextFloat();
        inputValue.close();

        //Comprobar la edad

        if (numero >= 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
