package Dictadoç;

public class EjercicioI4 {
    public static void main(String[] args) {
        
        int []numero= new int [1000];
        int multiplo3=3;
        int multiplo7=7;

        for(int i=0;i< numero.length;i++){
            if(i%2==0){
                numero[i]=multiplo3;
                multiplo3=multiplo3+3;
            }else{
                numero[i]=multiplo7;
                multiplo7=multiplo7+7;
            }
        }

        for(int i=13;i<numero.length;i= i + 13){
            System.out.println(numero[i]+" ");
        }


    }
}
