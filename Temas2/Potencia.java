package Temas2;

public class Potencia {
    public static double potencia (double n1, int n2){
        double elevado=n1;
        for (int i=2;i<=n2;i++){
            elevado=elevado*n1;
        }
        return elevado;
        
        
    }
    
}
