package Arrays;

public class Comunes {
    public static void main(String[] args) {
        int[]numeros1={2,5,4,1,45,7,2,4,6,8};
        int[]numeros2={4,6,2,5,8,2,4,7,4,3,1};
        for(int i=0;i<numeros1.length;i++){
            for(int x=0;x<numeros2.length;x++){
                if(numeros1[i]==numeros2[x]){
                    System.out.println("indice "+i +" "+ x);
                }
            }
        }
    }
    
}
