package Arrays;
import java.util.Arrays;
import java.lang.Math;

public class RellenarMatriz {
    public static void main(String[] args) {
      int [][]anArray=new int[10][10];
      

    for(int i=0;i<10;i++){
        for (int x=0;x<10;x++){
            int numeroAleatorio=(int)(Math.round(Math.random()*1)+0);
            anArray[i][x]= numeroAleatorio;
        }
    }
    System.out.println("matriz : " + Arrays.deepToString(anArray));  
    }
}
