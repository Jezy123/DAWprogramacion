package Eliminarcomentariosjava;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EliminarComentariosJava2 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./Eliminarcomentariosjava/Prueba.java");
        BufferedReader breader = new BufferedReader(reader);

        FileReader reader2 = new FileReader("./Eliminarcomentariosjava/Prueba.java");
        BufferedReader breader2 = new BufferedReader(reader2);

        int totalLineas= (int) breader2.lines().count();
        String line=breader.readLine();
        int repeticiones=0;  
        String texto="";
        int comentAbrir=0;
        int entro=0;

        while(totalLineas!=repeticiones) {

            String[] parts = line.split(" ");

          
            for (String palabra : parts) {

                if(palabra.equals("//") && comentAbrir!=1){
                    String[] separador=line.split("//");
                    texto=texto+separador[0]+"\n";
                    entro=1;
                    break;
                }

                if(palabra.equals("/*") && comentAbrir!=1){
                    comentAbrir=1;
                    String[] separador=line.split("/*");
                    texto=texto+separador[0]+"\n";
                    entro=1;                  
                }

                if(palabra.equals("*/") && comentAbrir==1){
                    comentAbrir=0;
                    String[] separador=line.split("/*");
                    texto=texto+separador[1]+"\n";
                    entro=1;                 
                }
         
            }
            if(comentAbrir==1 && entro==0){
                texto=texto+"\n";
                line=breader.readLine();
            }else if(comentAbrir==0 && entro==0){
                texto=texto+line+"\n";
                line=breader.readLine();
            }else{
                line=breader.readLine(); 
            }
            repeticiones++;
            entro=0;

        }

        // saber cual va antes si // o */ uno anula al otro
        //saber cuando cierra */
        // tener en cuenta de que /* puede iniciarse y cerrarse a mitad de linea

        FileWriter writer= new FileWriter("./Eliminarcomentariosjava/Prueba.java");
        BufferedWriter bWriter = new BufferedWriter(writer);

        bWriter.write(texto);   
        System.out.println(texto);
        breader2.close();
        breader.close();
        bWriter.close();             

    }

}
