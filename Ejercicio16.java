import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        
        //Declaracion de variables 
        String  op;
        byte x;
        byte y;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce tu operacion ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        op =inputValue.next();
        System.out.println("Introduce un  numero X ");
        x =inputValue.nextByte();
        System.out.println("Introduce unnumero Y ");
        y =inputValue.nextByte();

        inputValue.close();

        switch(op){
            case "+":
            System.out.println(x + "+" + y + " = "+ (x+y));
            break;

            case "-":
            System.out.println(x + "-" + y + " = "+ (x-y));
            break;

            case "*":
            System.out.println(x + "*" + y + " = "+ (x*y));
            break;

            case "/":
            System.out.println(x + "/" + y + " = "+ (x/y));
            break;

        }
    }
}