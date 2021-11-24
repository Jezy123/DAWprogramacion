package Arrays;

public class Iguales {
    public static void main(String[] args) {
        double moduloVector1=0;
        double moduloVector2=0;
        int[]vector1={2,5,1,6};
        int[]vector2={5,1,2,6};
        for(int i=0;i<vector1.length;i++){
            moduloVector1+= Math.pow(vector1[i], 2);
        }
        moduloVector1=Math.sqrt(moduloVector1);

        for(int i=0;i<vector2.length;i++){
            moduloVector2+= Math.pow(vector1[i], 2);
        }

        moduloVector2=Math.sqrt(moduloVector2);
        
        if(moduloVector1==moduloVector2){
            System.out.println("EL vector 1 es igual al vector 2");
        }else{
            System.out.println("El vector 1 es diferente al vector 2");
        }
    }
    
}
