package Tema2Voids.Temas2;

public class Primos {
    public static String primos(){

        int n=3;
        String esPrim="";
        String solucion="";

        for (;n<=100;n++){
            esPrim=Primo.esPrimo(n);
            if (esPrim=="El numero es primo"){
            solucion+=n+ " ";
            }
                   
        }
        return solucion;
        
    }
    
}
