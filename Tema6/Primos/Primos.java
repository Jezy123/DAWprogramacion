import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.File;

public class Primos {
    public static void main(String[] args) throws Exception {
    
        File fOut = new File("./primos.dat");
        FileOutputStream writer = new FileOutputStream(fOut);
        PrintStream printer = new PrintStream(writer);

        int numero;
        double resto;
        double resultado;
        printer.print(1+" ");    
        for (numero = 2 ; numero <= 500; numero++){
                                  
            for(int i = 2;i <= numero;i++) {

                resto = numero%i;
                resultado = numero/i;
                
                if (resto == 0 && resultado == 1){
                    printer.print(numero+" ");    
                }else if (resto == 0 && resultado != 1){
                   break;
                }
            }            
        }
        printer.close();
        writer.close();


    }
}
