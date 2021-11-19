package Arrays;
import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {

        int [] numeritos={3,4,6,8,2,36};
        int[] numeritos2={0,0,0,0,0,0};
        int x=0;
        int indice=0;
        
        for (int i=0;i<=5;i++){
            System.out.print(numeritos[i]+" ");
        }
        Scanner lector;
        lector=new Scanner(System.in);

        System.out.println("");
        System.out.println("Introduce el indice del valor del array que quieres mover");
        
        do{
            
            if(indice>6){
                System.out.println("ERROR!!! Introduce un indice valido");
            }
            
            indice=lector.nextInt();
        }while(indice>6);

        for(int i=0;i<=5;i++){
            if(i!=indice){
                numeritos2[x]=numeritos[i];
                x++;
            }

        }
        
        lector.close();

        numeritos2[5]=numeritos[indice];
        for (int i=0;i<=5;i++){
            numeritos[i]=numeritos2[i];
            System.out.print(numeritos[i]+" ");
        }
    }
    
}
