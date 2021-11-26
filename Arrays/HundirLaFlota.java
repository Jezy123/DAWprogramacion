package Arrays;
import java.util.Scanner;

public class HundirLaFlota {
    public static void  barcos(int[][]tablero){
        int n1;
        int n2;
        n1=(int) (Math.random()*8); 
        n2=(int) (Math.random()*8);
        for (int i=0;i<=10;i++){
            if (tablero[n1][n2] != 1) {
                tablero[n1][n2]=1;
            }
        }
    }
    public static void Imprimir(int NumericoX,int NumericoY,int[][]tablero){ 

        String[]Letras={"A","B","C","D","E","F","G","H"};

        System.out.println("  1 2 3 4 5 6 7 8");
        for(int i=0;i<tablero.length;i++){
            System.out.print(Letras[i]);
            for(int x=0;x<tablero[0].length;x++){
                

                System.out.print(" ");
                switch(tablero[i][x]){
                    case 0:
                        System.out.print("·");
                        break;
                    case 1:
                        System.out.print("+");
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
    }

    public static void main(String[] args) {
        int[][]tablero=new int[8][8];
        char Letra;
        int NumericoX;
        int NumericoY;
        barcos(tablero);
        char[]LetrasPosibles={'A','B','C','D','E','F','G','H'};

        System.out.println("Introduze una fila ");
        Scanner lector= new Scanner(System.in);
        Letra=lector.next().charAt(0);

        System.out.println("Introduze una Columna ");
        NumericoX=lector.nextInt();

        for (int i=0;i<=LetrasPosibles.length;i++){
            if(LetrasPosibles[i]==Letra){
                NumericoY=i+1;
            }
        }
        Imprimir(NumericoX,NumericoY,tablero);
    }
    
}
