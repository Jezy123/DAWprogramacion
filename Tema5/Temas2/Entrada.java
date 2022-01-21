package Tema5.Temas2;
import java.util.Scanner;

public class Entrada {
    public static int getInteger() {

        int nsindecimales = 0;
        boolean comprueba_n;

        Scanner lector;
        lector= new Scanner(System.in);

        do{  
            comprueba_n= lector.hasNextInt();
            if (comprueba_n) {
                nsindecimales=lector.nextInt();
                
            } else {
                lector.nextLine();
                
            }
        }while(!comprueba_n);
        
        return nsindecimales;
        
    }    

    public static double getDouble() {
        
        double ncondecimales = 0.0;
        boolean comprueba_n;

        Scanner lector;
        lector= new Scanner(System.in);

        do{  
            comprueba_n= lector.hasNextDouble();
            if (comprueba_n) {
                ncondecimales=lector.nextDouble();                
            } else {
                lector.nextLine();               
            }
        }while(!comprueba_n);  


        return ncondecimales;
        
        
            
          
    }    
}
