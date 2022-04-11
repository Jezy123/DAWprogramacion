package ContarPalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class ContarPalabras2 {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("./"+args[0]);
        BufferedReader breader = new BufferedReader(reader);
        String newline = breader.readLine();
        String text="";
        int seguimiento=0;

        while(newline != null){
        text = newline;
        String[] palabras = text.split(" ");
        seguimiento=seguimiento + (Contador(args[1],palabras));
        newline = breader.readLine();
        }

        breader.close();
        System.out.println(seguimiento);
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
