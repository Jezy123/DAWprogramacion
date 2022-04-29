import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mezcla2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fInStream1 = new FileInputStream(args[0]);
        FileInputStream fInStream2 = new FileInputStream(args[1]);
        FileWriter archivoMezcla= new FileWriter(args[2]);
  
        BufferedReader lectorFichero1 = new BufferedReader(new InputStreamReader(fInStream1));
        BufferedReader lectorFichero2 = new BufferedReader(new InputStreamReader(fInStream2));

        String line1=lectorFichero1.readLine();
        String line2=lectorFichero2.readLine();

        while( line1 != null || line2 != null){
            if (line1 != null) {
                archivoMezcla.write(line1);                
                archivoMezcla.write("\n");
            }
            if(line2!=null){
                archivoMezcla.write(line2);
                archivoMezcla.write("\n");
            }
            line1=lectorFichero1.readLine();
            line2=lectorFichero2.readLine();
        }
        archivoMezcla.close();
        lectorFichero1.close();
        lectorFichero2.close();
    }
}
