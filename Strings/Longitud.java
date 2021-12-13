package Strings;

public class Longitud {
    public static void main(String[] args) {
      String Texto1=Utilidades.leerCadena("Introduce una frase");
        int Lpalabra=0;
        int Palabras4caracteres=0;
        
        Texto1= Texto1 + " ";
        for (int i=0;i<Texto1.length();i++){
            if(Texto1.charAt(i)!=' ' && Texto1.charAt(i)!=',' && Texto1.charAt(i)!='.' && Texto1.charAt(i)!='?' && Texto1.charAt(i)!='!'){
                Lpalabra++;
            }else{
                if(Lpalabra==4){
                    Palabras4caracteres++;
                }
                Lpalabra=0;
            }

        }
        System.out.println("Hay un total de "+ Palabras4caracteres+ " palabras con 4 caracteres");
    }
       
}
