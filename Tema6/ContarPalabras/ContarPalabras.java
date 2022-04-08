package ContarPalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ContarPalabras {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./"+args[0]);
        BufferedReader breader = new BufferedReader(reader);
        String newline = breader.readLine();
        String text="";

        while(newline != null){
        text = text+ newline+" \n";
        }

        String[] palabras = text.split(" ");

        System.out.println(Contador(args[1],palabras));
        breader.close();
    }


    private static int Contador(String detectar,String[]palabras){
        int contar=0;

        for (String item : palabras) {
            if(detectar.equals(item)){
                contar++;
            }
        }
        return contar;
    }
}
