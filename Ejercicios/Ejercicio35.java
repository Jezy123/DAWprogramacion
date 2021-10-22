package Ejercicios;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        
        int repeticiones=0;
        int nota;
        int notamedia=0;
        int finalizar=0;
        int[] anArray= new int[100];
        int maxnota = 0;
        
        
        
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("Introduce -1 para finalizar el programa");

        for (int i=0; finalizar<1 ; i++ ){

            System.out.println("Introduce un numero");
            nota=lector.nextInt();

            if (nota==-1){
                finalizar=100;
            }else{
                anArray[i]=nota;
                repeticiones++;
                if(nota==10){
                    maxnota++;
                }
          
            }
        
        }
        for(int i= repeticiones-1;  i>=0; i--  ){
            notamedia+=anArray[i];
        }
        notamedia=notamedia/(repeticiones);
        lector.close();
        
        if (repeticiones!=0){
            System.out.println("Tu media es de " + notamedia);
            if(maxnota!=0){
                System.out.println("Y has sacado un diez !!!"); 
            }else{
                System.out.println("Y no  has sacado ningun10");     
            }
        }else{
            System.out.println("Tu media es de 0 y no has sacado ningun 10");
        }
    }
}


       