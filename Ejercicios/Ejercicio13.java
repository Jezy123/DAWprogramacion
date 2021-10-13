package Ejercicios;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        int numero;
        int numero2;
        String Userpref;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce dos numeros ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        numero = inputValue.nextInt();
        numero2 = inputValue.nextInt();

        //El  usuario decide el orden escribiendo, posteriormentese guarda en una variable
        System.out.println("que orden deseas, ascendente o descendente? ");
        Userpref =inputValue.next();
        
        inputValue.close();

        //Comparacion de varibales y casos dependiendo de lo que elija el Usuario
        switch(Userpref){

            case "ascendente":

                if (numero>=numero2){
                    System.out.println(numero2 +" , "+numero);
                }else{
                    System.out.println(numero +" , "+ numero2);
                }
        
                break;

            case "descendente":

                if (numero>=numero2){
                    System.out.println(numero2 +" , "+numero);
                }else{
                    System.out.println(numero +" , "+ numero2);
                }
                break;
        }
    
    }
    
}
