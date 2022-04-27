package Eliminarcomentariosjava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentariosJava {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./Eliminarcomentariosjava/Prueba.java");
        BufferedReader breader = new BufferedReader(reader);

        FileReader reader2 = new FileReader("./Eliminarcomentariosjava/Prueba.java");
        BufferedReader breader2 = new BufferedReader(reader2);

        int totalLineas= (int) breader2.lines().count();
        String line=breader.readLine();
        int repeticiones=0;  
        String texto="";

        while(totalLineas!=repeticiones) {

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
            repeticiones++;
        }

        FileWriter writer= new FileWriter("./Eliminarcomentariosjava/Prueba.java");
        BufferedWriter bWriter = new BufferedWriter(writer);

        bWriter.write(texto);   
        System.out.println(texto);
        breader.close();
        breader2.close();
        bWriter.close();             

    }
}
