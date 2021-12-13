package Strings;
public class Longitud3 {
    public static void main(String[] args) {
      String Texto1=Utilidades.leerCadena("Introduce una frase");
        int Lpalabra=0;
        int Palabras4caracteres=0;
        int PalabraGrande=0;
        int Num=Utilidades.leerEntero("Introduza un numero");
        
        Texto1= Texto1 + " ";
        for (int i=0;i<Texto1.length();i++){
            if(Texto1.charAt(i)!=' ' && Texto1.charAt(i)!=',' && Texto1.charAt(i)!='.' && Texto1.charAt(i)!='?' && Texto1.charAt(i)!='!'){
                Lpalabra++;
            }else{
                if(Lpalabra==Num){
                    Palabras4caracteres++;
                }
                if(Lpalabra>Num){
                    PalabraGrande++;
                }
                Lpalabra=0;
            }

        }
        if(PalabraGrande==0){
            System.out.println("Ninguna palabra supera los "+Num +" carcteres");
        }if(PalabraGrande!=0){
            System.out.println("Hay alguna palabra larga");
        }
        System.out.println("Hay un total de "+ Palabras4caracteres+ " palabras con "+Num+" caracteres");
    }   
       
}
