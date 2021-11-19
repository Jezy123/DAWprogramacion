package Ejercicios;

public class Ejercicio47 {

    public static void marco(String[] Texto){   
        int masLargo=0;
    
        for (int i=0;i<=4;i++){
            if(masLargo < Texto[i].length()){
                masLargo=Texto[i].length();
               
            }

        }

        for(int i=0;i<=4;i++){
            while(Texto[i].length()<masLargo){
              
                Texto[i]=Texto[i]+" ";
                
            }
        }

        for (int i=0;i<=masLargo+1;i++){
            System.out.print("*");
        }

        System.out.println("");
        for(int i=0;i<=4;i++){
            System.out.println("*"+Texto[i]+"*");
        }

        for (int i=0;i<=masLargo+1;i++){
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void main(String[] args) {
        String[] palabras={"hola","chicos","esto","es","marco"};
        marco(palabras);
        
    }
        
        
    

}
