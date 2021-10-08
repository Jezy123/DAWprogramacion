import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        double nota;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce tu nota   ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);

    
        nota = inputValue.nextDouble();

        inputValue.close();

        //Comparacion de varibales y casos dependiendo de lo que elija el Usuario
        if (nota<3){
            System.out.println("Muy deficiente");

        }else if (nota>=3 && nota<5){
            System.out.println("Insuficiente");

        }else if (nota>=5 && nota<6){
            System.out.println("Suficinte");

        }else if (nota>=6 && nota<7){
            System.out.println("Introduce un numero positivo o negativo");

        }else if (nota>=7 && nota<9){
            System.out.println("Introduce un numero positivo o negativo");

        }else if (nota>=9 && nota<=10){
            System.out.println("Introduce un numero positivo o negativo");
        }
    
    }
    
}
