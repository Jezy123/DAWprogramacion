package EstadisticasDeTexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Estadisticas2 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./EstadisticasDeTexto/Ejemplo1.txt");
        BufferedReader breader = new BufferedReader(reader);

        int numeroDePalabras = 0;
        int numeroDeVocales = 0;
        int numeroDeConsonantes = 0;
        int numeroDeEspacios = 0;
        int numeroDeTab = 0;
        int numeroDeLineas = 0;
        int ch = breader.read();
        
        while(ch != -1){
            char chtxt=(char)ch;
            chtxt=Character.toLowerCase(chtxt);
    
            //Elementos de una linea

                if(esEspacio(chtxt)){
                    numeroDeEspacios++;
                }else if(esVocal(chtxt)){
                    numeroDeVocales++;                 
                }else if(esConsonante(chtxt)){
                    numeroDeConsonantes++;
                }else if(esTabchar(chtxt)){
                    numeroDeTab++;          
                }else if(salto(ch)){
                    numeroDeLineas++;
                }            
        

            ch=breader.read();
            
        }
        System.out.println("Numero de palabras = "+numeroDePalabras+"\n"+
                            "Numero de letras = "+(numeroDeVocales+numeroDeConsonantes)+"\n"+
                            "Numero de lineas ="+numeroDeLineas+"\n"+
                            ((numeroDeVocales*100)/(numeroDeConsonantes+numeroDeEspacios+numeroDeVocales+numeroDeTab))+" % de vocales \n"+
                            ((numeroDeConsonantes*100)/(numeroDeConsonantes+numeroDeEspacios+numeroDeVocales+numeroDeTab))+" % de consonantes \n"+
                            ((numeroDeEspacios*100)/(numeroDeConsonantes+numeroDeEspacios+numeroDeVocales+numeroDeTab))+" % de espacios \n"+
                            ((numeroDeTab*100)/(numeroDeConsonantes+numeroDeEspacios+numeroDeVocales+numeroDeTab))+" % de tabuladores \n"
                            );
    
        breader.close();
    }
        

    public static boolean salto (int letra){
        if(letra==10){
            return true;                   
        }
        return false;
    } 

    public static boolean esTabchar (char letra){
        if(letra=='\t'){
            return true;                   
        }
        return false;
    } 

    public static boolean esEspacio(char letra){
        if(letra==' '){
            return true;                   
        }
        return false;
    } 

    public static boolean esVocal(char letra){


        char [] vocales={'a','e','i','o','u','á','é','í','ó','ú'};
        
            for(int x=0;x< vocales.length;x++){
                if(letra==vocales[x]){
                    return true;                   
                }
            }
        
        return false;
    }

    public static boolean esConsonante(char letra){


        char [] consonantes={'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};
        
            for(int x=0;x< consonantes.length;x++){
                if(letra==consonantes[x]){
                    return true;                   
                }
            }
        
        return false;
    }
}
