package Temas2;
import java.util.Scanner;

public class Entrada {
    public static int getInteger() {

        int x = 0;

        Scanner lector;

        do{         
            System.out.println("introduce un numero");
            lector=new Scanner(System.in);
        }while(lector.hasNextInt()== false);

        x=lector.nextInt();
        
        lector.close();
        return x;
        
    }    

    public static double getDouble() {

        double x = 0.0;
        boolean z;
        int i = 0 ;
    
        Scanner lector;
        lector=new Scanner(System.in);

        do{  
            z= lector.hasNextDouble();
            if (z==true){
                x=lector.nextDouble();
                i++;
            }
        }
        while(i==0);
        return x;
        
            
          
    }    
}
