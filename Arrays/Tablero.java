package Arrays;

public class Tablero {
    public static void main(String[] args) {
        int[][] tablero = {

            {0, 0, 1, 1, 0, 1, 0, 0},
            {3, 0, 0, 0, 3, 0, 0, 1},
            {0, 0, 1, 0, 0, 3, 0, 0},
            {2, 0, 0, 0, 3, 0, 0, 0},
            {1, 0, 0, 3, 3, 2, 0, 0},
            {0, 0, 0, 1, 2, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}
        };
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
    
}
