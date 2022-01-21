package Tema2Voids.Temas2;
public class Positivos {
    public static int positivos( int[]array) {

        int Tnumeros=0;
        
        for(int i=0;i<=array.length-1;i++){
            if(array[i]>0){
                Tnumeros++;
            }
        }
        return Tnumeros;
        
        
    }

    
}
