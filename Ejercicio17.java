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

            case 1:
                System.out.println("Tiene 31 dias");
                break;
            

            case 2:
                System.out.println("Tiene 28 dias");
                break;

            case 3:
                System.out.println("Tiene 31 dias");
                break;

            case 4:
                System.out.println("Tiene 30 dias");
                break;
            
            case 5:
                System.out.println("Tiene 31 dias");
                break;

            case 6:
                System.out.println("Tiene 30 dias");
                break;

            case 7:
                System.out.println("Tiene 31 dias ");
                break;
            

            case 8:
                System.out.println("Tiene 30 dias");
                break;

            case 9:
                System.out.println("Tiene 31 dias");
                break;

            case 10:
                System.out.println("Tiene 30 dias");
                break;
            
            case 11:
                System.out.println("Tiene 31 dias ");
                break;

            case 12:
                System.out.println("Tiene 30 dias");
                break;
        }
    }
}