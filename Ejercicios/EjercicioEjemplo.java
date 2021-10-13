package Ejercicios;

public class EjercicioEjemplo {
    public static void main(String[] args) {
        int i = 0;

        //Estrutura PARA
        for(i=0; i < 10; i++){
        System.out.println("Hola: "+ i );
        }
        i=0;

        //Estructura HASTA
        while ( i < 10){
            System.out.println("Hola: "+ i );
            i++;
        }
        i=0;


        //Estructura Mientras

        do{
            System.out.println("Hola: "+ i );
            i++;


        }while (i<10);
    }
}