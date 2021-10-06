import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        int numero;
        int numero2;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce dos numeros ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        numero = inputValue.nextInt();
        numero2 = inputValue.nextInt();
        
        inputValue.close();

        //Comparacion de varibales 
        if (numero>=numero2){
            System.out.println(numero);
        }else{
            System.out.println(numero2);
        }
    
    }
    
}
