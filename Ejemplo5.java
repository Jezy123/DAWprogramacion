import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        
    
    float x;
    float y;
    float sum;
    float res;
    float div;
    float mult;

    System.out.println("Enter the number x");

    Scanner inputValue;
    inputValue= new Scanner(System.in);
    x = inputValue.nextFloat();
    System.out.println("Enter the number Y");
    y = inputValue.nextFloat();

    sum = x+y;
    res = x-y;
    div = x/y;
    mult = x*y;

    System.out.println(" suma= " + sum + " resta = " + res + " dividision= " + div + " multiplicacion = " + mult );
    inputValue.close();
    }
}
