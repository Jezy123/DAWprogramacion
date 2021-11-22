package Arrays;

public class Duplicados {
    public static void main(String[] args) {

        int [] numeros={2,4,7,3,3,6,3,1,2};
        for (int i=0;i<numeros.length;i++){
            for(int x=0;x<numeros.length;x++){
                if(numeros[i]==numeros[x]){
                    if(x!=i){
                    System.out.println("indice "+i+" "+x);
                    }
                
                }

            }
        numeros[i]=0;
        }
    }
    }
