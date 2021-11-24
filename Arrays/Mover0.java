package Arrays;

public class Mover0 {
    public static void main(String[] args) {
        int [] numeritos={3,0,0,8,2,36,3,0,1,2,0,4,5};
        int[] numeritos2=new int [numeritos.length];
        int x=0;
        for (int i=0;i<numeritos.length;i++){
            System.out.print(numeritos[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<numeritos.length;i++){
            if(numeritos[i]!=0){
                numeritos2[x]=numeritos[i];
                x++;
            }
        }
        for(;x<numeritos2.length;x++){
            numeritos2[x]=0;
        }

        for(int i=0;i<numeritos2.length;i++){
            numeritos[i]=numeritos2[i];
        }
        for (int i=0;i<numeritos.length;i++){
            System.out.print(numeritos[i]+" ");
        }
    
    }  
    
}
