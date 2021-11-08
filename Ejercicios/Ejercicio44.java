package Ejercicios;
import java.util.Scanner;
public class Ejercicio44{
    public static void main(String[] args) {
        
        String  binario;
        int decimal=0;
        int repeticiones=0;
        
        Scanner lector;
        lector= new Scanner(System.in);
        System.out.println("Introduceun numero binario");
        binario=lector.nextLine();
        lector.close();

        for (int i=binario.length()-1;i>=0;i--){
            char letra= binario.charAt(i);
            if(letra=='1'){
                decimal+= Math.pow(2, repeticiones);
                
            }
            repeticiones++;

        }
        System.out.println(decimal);
    }
}
