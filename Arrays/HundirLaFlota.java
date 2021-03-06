package Arrays;
import java.util.Scanner;

public class HundirLaFlota {
    public static void  barcos(int[][]tablero){
        int n1;
        int n2;
        int cont = 0;

        while (cont <10) {
            n1 = (int) (Math.random()*8); 
            n2 = (int) (Math.random()*8);
            if (tablero[n1][n2] != 1) {
                tablero[n1][n2]=1;
                cont++;
            }
        }

        
    }

    public static int Imprimir(int NumericoX,int NumericoY,int[][]tablero,int barcosNoHundidos){ 

        String[]Letras={"A","B","C","D","E","F","G","H"};


        System.out.println("  1 2 3 4 5 6 7 8");

        if(tablero[NumericoY][NumericoX]==1){
            tablero[NumericoY][NumericoX]=3;
            barcosNoHundidos=barcosNoHundidos-1;

        }else{tablero[NumericoY][NumericoX]=2;} 
        
        for(int i=0;i<tablero.length;i++){
        
            System.out.print(Letras[i]);
            for(int x=0;x<tablero[0].length;x++){
                

                System.out.print(" ");
            
                    switch(tablero[i][x]){
                        case 0:
                            System.out.print("·");
                            break;
                        case 1:
                            System.out.print("·");
                          
                            break;
                        case 2:
                            System.out.print("0");
                            break;
                        case 3:
                            System.out.print("X");
                    }
    

            }
        System.out.println("");
        }
        return barcosNoHundidos;
    }

    public static void main(String[] args) {
        int[][]tablero=new int[8][8];
        char Letra;
        int disparosRealizados=0;
        int NumericoX;
        int barcosNoHundidos=10;
        int NumericoY=0;
        barcos(tablero);
        char[]LetrasPosibles={'A','B','C','D','E','F','G','H'};
        Scanner lector= new Scanner(System.in);

        while(barcosNoHundidos>=1){
            System.out.println("Introduze una fila (letra en mayúscula) ");
            
            Letra=lector.next().charAt(0);

        
            System.out.println("Introduze una Columna ");
        
            NumericoX=lector.nextInt();
        
            NumericoX=NumericoX-1;
            for (int i=0;i<LetrasPosibles.length;i++){
                if(LetrasPosibles[i]==Letra){
                    NumericoY=i;
                }
            }
      
            barcosNoHundidos=Imprimir(NumericoX, NumericoY, tablero,barcosNoHundidos);
            System.out.println(barcosNoHundidos +" Barcos sin hundir");
            disparosRealizados++;
            System.out.println(disparosRealizados+" Disparos");
        }
        System.out.println("Tu Ganas");
        lector.close();
    }
    
}
