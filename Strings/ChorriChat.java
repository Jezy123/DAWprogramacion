package Strings;
import java.util.Scanner;

public class ChorriChat {
    public static boolean Saludo(String[] arrayUsuario,String[] saludo){
        for(int i=0;i<arrayUsuario.length;i++){
            for(int x=0;x<saludo.length;x++){

                if(arrayUsuario[i].equals(saludo[x])){
                    return true;
                 
                }
            }
        }
        return false;


    }
    public static boolean Despedida(String[] arrayUsuario,String[] despedida){
        for(int i=0;i<arrayUsuario.length;i++){
            for(int x=0;x<despedida.length;x++){
                if(arrayUsuario[i].equals(despedida[x])){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String saludo[]={"hola","buenos dias","buenas"};
        String despedida[]={"chao","ta luego","adios","bye"};
        String random[]={"Mmm, es un tema interesante","No he entendido lo que dices","No hablo tu idioma"};
        String textoUsuario="";
        int protocolo=0;
        int primeravez=0;
        
        System.out.println("_____ChorriChat______");
       
            do{
                textoUsuario=Utilidades.leerCadena("");
                textoUsuario=textoUsuario.toLowerCase();
                String arrayUsuario[]=Utilidades.dividirEnPalabras(textoUsuario);


                if(Saludo(arrayUsuario,saludo)==true && primeravez==0){
                    System.out.println("Hola soy Charry tu assistente");
                    primeravez++;
                   
                }else{
                    System.out.println("Eres una persona maleducada");
                    primeravez++;
                    
                }
                if(Despedida(arrayUsuario, despedida)==false ){
                    int numerito=(int)Math.random()*2;
                    System.out.println(random[numerito]);
                   
                }else{
                    System.out.println("Adios");
                    protocolo++;
                }
            
            }
            while (protocolo==0); 
                


    }
}
