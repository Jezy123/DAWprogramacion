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
  
        BufferedReader br = new BufferedReader(new InputStreamReader(fInStream1));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fInStream2));

        String line1=br.readLine();
        String line2=br2.readLine();

        while( line1 != null || line2 != null){
            if (line1 != null) {
                archivoMezcla.write(line1);                
                archivoMezcla.write("\n");
            }
            if(line2!=null){
                archivoMezcla.write(line2);
                archivoMezcla.write("\n");
            }
            line1=br.readLine();
            line2=br2.readLine();
        }
        archivoMezcla.close();
        br.close();
        br2.close();
    }
}
