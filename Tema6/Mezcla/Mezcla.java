import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mezcla {
    public static void main(String[] args) throws IOException {

        FileInputStream fInStream1 = new FileInputStream(args[0]);
        FileInputStream fInStream2 = new FileInputStream(args[1]);
        FileWriter archivoMezcla= new FileWriter(args[2]);
  
        BufferedReader br = new BufferedReader(new InputStreamReader(fInStream1));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fInStream2));

        while( br.readLine() == null && (br2.readLine() == null)){
            if ((br.readLine()) != null) {
                archivoMezcla.write(br.readLine());
            }
            if((br2.readLine())!=null){
                archivoMezcla.write(br2.readLine());
            }
        archivoMezcla.close();
        br.close();
        br2.close();
        }
    }
}
