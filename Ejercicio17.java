import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        
        //Declaracion de variables
        byte mes;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce un mes ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        mes = inputValue.nextByte();

        inputValue.close();

        switch(mes){

            case 1 :
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("Tiene 31 dias");
                break;
            
            case 2:
                System.out.println("Tiene 28 dias");
                break;

            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 30 dias");
                break;
            default:
            System.out.println("Introduce un mes valido");
       
        }
    }
}