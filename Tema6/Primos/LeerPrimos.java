import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class LeerPrimos {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("./primos.dat");
        BufferedReader Breader = new BufferedReader(reader);
        String line = Breader.readLine();
        while(line !=null){
        System.out.println(line);
        line = Breader.readLine();
        }
        Breader.close();
    }
}
