package Tema5.Temas2;

public class Potencia {
    public static double potencia (double n1, int n2){

        if(n2==0){
            return 1;
        }else{
            return(n1*potencia(n1,n2-1));
        }
        
        
    }
    
}
