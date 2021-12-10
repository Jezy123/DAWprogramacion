package Arrays;

public class ValoresACero {

    public static void RellenarMatriz(int[][]anArray) {
    
        for(int i=0;i<10;i++){
            for (int x=0;x<10;x++){
                int numeroAleatorio=(int)(Math.round(Math.random()*1)+0);
                anArray[i][x]= numeroAleatorio;
                System.out.print(anArray[i][x]+" ");
            }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
        int [][]anArray=new int[10][10];
        RellenarMatriz(anArray);
        int NDeCeros=0;
        int Filas=0;
        int Columnas=0;

        //Filas
        for(int i=0;i<10;i++){
            for (int x=0;x<10;x++){
                if(anArray[i][x]==0){
                    NDeCeros++;
                }
                if(NDeCeros==10){
                    Filas++;
                }
            }
        NDeCeros=0;
        }

        //Columas
        for(int x=0;x<10;x++){
            for (int i=0;i<10;i++){
                if(anArray[i][x]==0){
                    NDeCeros++;
                }
                if(NDeCeros==10){
                    Filas++;
                }
            }
        NDeCeros=0;
        }
        
        System.out.println("Hay un total de "+Filas+"  filas llenas de ceros");
        System.out.println("Hay un total de "+Columnas+"  Columnas llenas de ceros");

    }

    
}
