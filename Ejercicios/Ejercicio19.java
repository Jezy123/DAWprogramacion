package Ejercicios;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        
        double horas;
        double precioHora;
        double GanadoSinImpuestos;
        double GanadoNeto=0;
        double Tasas=0;


        //Inicio de programa y obtencion de los numeros
        System.out.println("Introduce las horas  ");
        
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        horas =inputValue.nextDouble();
        System.out.println("Introduce elsalario por hora");
        precioHora =inputValue.nextDouble();
        inputValue.close();

        if (horas >35 ){
            GanadoSinImpuestos = precioHora * 1.5 * (horas - 35 ) + precioHora * 35;
        }else{
            GanadoSinImpuestos = precioHora * 35;
        }

        if (GanadoSinImpuestos<=500){

            GanadoNeto=GanadoSinImpuestos;    
            Tasas=0;
            GanadoNeto= GanadoSinImpuestos-Tasas;

        } else if (GanadoSinImpuestos<=900){
               
                Tasas= ((GanadoSinImpuestos-500)*0.25);
                GanadoNeto= GanadoSinImpuestos-Tasas;


        } else if (GanadoSinImpuestos>900){

            Tasas=((GanadoSinImpuestos-900)*0.45) + (400*0.25);
            GanadoNeto= GanadoSinImpuestos-Tasas;

        }

        System.out.println("El salario neto es de " + GanadoNeto);
        System.out.println("Elsalario sin Impuestos es de "  + GanadoSinImpuestos);
        System.out.println("Los impuestos son"+ Tasas);
    }
}





               