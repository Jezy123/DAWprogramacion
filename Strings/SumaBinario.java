package Strings;

public class SumaBinario {
   public static void main(String[] args) {
    String  binario1=Utilidades.leerCadena("Introduce un numero binario");
    String  binario2=Utilidades.leerCadena("Introduce un numero binario");
    int decimal1=0;
    int decimal2=0;
    int decimalT=0;
    int repeticiones=0;
    String binarioT="";

    for (int i=binario1.length()-1;i>=0;i--){
        char letra= binario1.charAt(i);
        if(letra=='1'){
            decimal1+= Math.pow(2, repeticiones);
            
        }
        repeticiones++;

    }
    repeticiones=0;

    for (int i=binario2.length()-1;i>=0;i--){
        char letra= binario2.charAt(i);
        if(letra=='1'){
            decimal2+= Math.pow(2, repeticiones);
            
        }
        repeticiones++;

    }
    decimalT=decimal1+decimal2;
    repeticiones=0;
    do {
        int residuo=decimalT%2;
        decimalT=decimalT/2;
        if(residuo==1){
            binarioT="1" + binarioT;
        }else{
            binarioT="0"+binarioT;
        }
        if (decimalT/2==0){
            repeticiones++;
        }


    }while(repeticiones!=2);
    System.out.println(binarioT);
    }

}
   

