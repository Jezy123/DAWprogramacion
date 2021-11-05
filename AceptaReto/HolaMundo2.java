package AceptaReto;
import java.util.Scanner;
public class HolaMundo2 {
    public static void main(String[] args) {
        int n;
        Scanner lector;
        lector=new Scanner(System.in);
        n=lector.nextInt();

        for(int i = 0; n>i ;i++){
            System.out.println("Hola mundo.");
        }
        lector.close();
    }
    
}
