package Ejercicios;
import java.util.Scanner;
public class Ejercicio45{
    public static void main(String[] args) {
        
        int  decimal;
        String binario="";
        int residuo;
        int repeticiones=0;

        
        Scanner lector;
        lector= new Scanner(System.in);
        System.out.println("Introduceun numero decimal");
        decimal=lector.nextInt();
        lector.close();


        do {
            residuo=decimal%2;
            decimal=decimal/2;
            if(residuo==1){
                binario="1" + binario;
            }else{
                binario="0"+binario;
            }
            if (decimal/2==0){
                repeticiones++;
            }


        }while(repeticiones!=2);
        System.out.println(binario);
    }
}
