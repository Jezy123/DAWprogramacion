package Ejercicios;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        
        int horas;
        int precioHora;
        int GanadoSinImpuestos;


        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce las horas  ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        horas =inputValue.nextInt();
        System.out.println("Introduce elsalario por hora");
        precioHora =inputValue.nextInt();
        inputValue.close();

        if (horas <35 ){
            GanadoSinImpuestos = precioHora * 1,5 * (horas - 35 ) + precioHora * 35;
        }else{
            GanadoSinImpuestos = precioHora * 35;
        }


               