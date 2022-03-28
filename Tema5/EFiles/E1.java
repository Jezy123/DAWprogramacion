import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        
       
        File f = File.listRoots()[0];      
        File[] directorio = f.listFiles();
        Scanner lector = new Scanner(System.in);
        int radio=0;
        int n=1;
        String queEs="";
        do{
            System.out.println("Lista de ficheros y directorios del directorio: "+f+"  ------------");

            if(f.getParent()==null){
                System.out.println("0-Directorio padre");
            }else{
                System.out.println(0+"-"+f.getParent());
            }
            for (File elemento : directorio) {
                if(elemento.isDirectory()){
                    queEs=" <Directorio>";
                }else{
                    queEs="";
                }
                System.out.println(n+"-"+elemento+queEs);
                n++;   
            }
            radio = lector.nextInt();
            n=1;
            if(radio==0){
                f=f.getParentFile();
            }else{
                if(directorio[radio-1].canRead()){                
                    f=directorio[radio-1];
                }else{
                    System.out.println("No tienes permisos de lectura");
                }
            }
            directorio=f.listFiles();
        }while (radio != -1); 
            
        
    }
}
