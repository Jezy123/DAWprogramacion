package Ejercicios;

public class Ejercicio29 {
    public static void main(String[] args) {

        int numero;
        double resto;
        double resultado;


        for (numero=3; numero<101;numero++){

            for(int i=2; i<(numero+1); i++){


                resto=numero%i;
                resultado=numero/i;
            
                if (resto ==0 && resultado==1){
                    System.out.print(numero +" " );

                }else if (resto==0 && resultado!=1){
                    
                    i= numero+1;
                }
            }
        }

    }
}
