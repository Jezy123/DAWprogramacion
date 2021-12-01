package Arrays;
import java.util.Scanner;
public class SumaIgual {
    public static void main(String[] args) {
        int numero;
        int [] arrayNum={1,2,4,5,7,3,7,8,1,9,0};

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero=lector.nextInt();

        for (int i=0;i<arrayNum.length;i++){

            for (int x=i;x<arrayNum.length;x++){
                if(arrayNum[i]+arrayNum[x]==numero){
                    System.out.println("Indice "+i+" "+x+" "+"("+arrayNum[i]+"+"+arrayNum[x]+")");
                }
            }
        }
    lector.close();
    }

    
}
