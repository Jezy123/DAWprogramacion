package Ejercicios;

public class Ejercicio31 {

    public static void main(String[] args) {
            // declares an array of integers
        int[] anArray;
            // allocates memory for 10 integers
        anArray = new int[10];
            // initialize first element
        anArray[0] = 100;
            // initialize second element
        anArray[1] = 200;
            // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        for(int i=0;i<10;i++){
        System.out.println("Element at index 0: "
                           + anArray[i]);
        }
        
    }
}
    

