package Arrays;
import java.util.Arrays;

public class RellenarMatriz {
    public static void main(String[] args) {
      int Ax[][]=new int[10][10];
      
    }
    for(int i=0;i<=10;i++){
        for (int x=0;x<=10;x++){
            Ax[i][x]=(int) (Math.random()*1)+1;
        }
    }
    System.out.println("matriz : " + Arrays.deepToString(Ax));  
}
