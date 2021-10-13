package Controles;
import java.util.Scanner;
public class Control01 {
    public static void main(String[] args) {
        
        //Declaración de variables

        int lados;
        float longitud;


        //Pido el numero de lados

        System.out.println("Dime el número de lados del polígono:");

        Scanner inputValue;
        inputValue= new Scanner(System.in);
        lados = inputValue.nextInt();
        
        //Compruebo si lados es 3 o 4 si nolo son el  programa acaba

        if (lados == 3 || lados ==4){

             //Pido la longitud

            System.out.println("Dime la longitud del lado del polígono:");
            longitud = inputValue.nextFloat();
            

            //Dependiendo del numero de lado calculara el perimetro del triangulo o cuadrado 

            switch(lados){
                case 3:
                System.out.println("El perimetro del triangulo es : "+ 3*longitud);
                break;

                case 4:
                System.out.println("El perimetro del cuadrado es : "+ 4*longitud);
                break;

            }

        }
        inputValue.close();

    }
    
}
