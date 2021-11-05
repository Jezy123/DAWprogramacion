package Controles.Control02;
import java.util.Scanner;
public class E07 {
    public static void main(String[] args) {

        int hora;
        int CdeHoras;
        int horaF;
        Scanner lector;
        lector=new Scanner(System.in);
        System.out.print("Hora actual: ");
        hora=lector.nextInt();
        System.out.print("Cantidad de horas: ");
        CdeHoras=lector.nextInt();
        lector.close();

        horaF= hora + CdeHoras;
        if (horaF>=24){
            horaF=horaF%24;
            System.out.println("En "+ CdeHoras + " horas, el reloj marcara las "+ horaF);
        }else{
            System.out.println("En "+ CdeHoras + " horas, el reloj marcara las "+ horaF); 
        }


    }
}
    
    
