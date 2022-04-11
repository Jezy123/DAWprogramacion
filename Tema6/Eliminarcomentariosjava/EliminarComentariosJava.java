package Eliminarcomentariosjava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentariosJava {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./"+args[0]);
        BufferedReader breader = new BufferedReader(reader);
        FileWriter writer= new FileWriter("./"+args[0]);
        BufferedWriter bWriter = new BufferedWriter(writer);
        String line=breader.readLine();

        String texto="";

        while(line != null) {
            System.out.println(texto);
            if(line.contains("//")){
                if(line.startsWith("//")){
                    texto=texto+"\n";
                }else{
                    String[] separador=line.split("//");
                    texto=texto+separador[0]+"\n";
                    
                }
            }else{                        
                texto=texto+line+"\n";
            }
            line=breader.readLine();
        }
        bWriter.write(texto);   
        System.out.println(texto);
        breader.close();
        bWriter.close();             

    }
}
