package Ejercicios;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        
        //Declaracion de variables 
        int  horas;
        int minutos;
        int segundos;
        int dias;

        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce la hora ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        horas =inputValue.nextInt();
        System.out.println("Introduce los minutos ");
        minutos =inputValue.nextInt();
        System.out.println("Introduce los segundos ");
        segundos =inputValue.nextInt();
        inputValue.close();

        dias = horas/24;
        
        segundos = segundos +1;
        if (segundos==60){

            segundos=00;
            minutos= minutos +1;

            if (minutos ==60){

                minutos = 00;
                horas = horas +1;
            
            
            }

        }

        if(horas >= 24){
            horas = horas - 24*dias;
        }

        System.out.println(horas +":" + minutos + ":" + segundos);
    }
}
    