package Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int nPar=0;
        int nImpar=0;
        int[]num={1,45,2,6,12,5,73,1,35,7,2,3,56,8,423,0};
        for(int i=0;i<num.length;i++){
            int x= num[i]%2;
            if(x==0){
                nPar++;
            }else{
                nImpar++;
            }
        }
        System.out.println("El numero de pares es "+ nPar);
        System.out.println("El numero de impares es "+ nImpar);
    }
    
}
