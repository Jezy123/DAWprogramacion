package Temas2;

public class Primo {
    public static String esPrimo(int n){

        double resto;
        double resultado;
        String primo="";

        for(int i=2; i<(n+1); i++){

            resto=n%i;
            resultado=n/i;


            if (resto ==0 && resultado==1){
                primo="El numero es primo";

            }else if (resto==0 && resultado!=1){
                primo="El numero no primo";
                i= n+1;
            }
        }
        if (n==1){
            primo="El numero es primo";
        }
        return primo;
        
    }
    
}
