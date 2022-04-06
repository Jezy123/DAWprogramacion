package Tema6.EFiles;
import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        
        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());
        String permisos="";
        File f = File.listRoots()[0];      
        File[] directorio = f.listFiles();
        Scanner lector = new Scanner(System.in);
        int radio=0;
        int n=1;

        do{
            System.out.println("Lista de ficheros y directorios del directorio: "+f+"  ------------");

            if(f.getParent()==null){
                System.out.println("0-Directorio padre");
            }else{
                System.out.println(0+"-"+f.getParent());
            }

            for (File elemento : directorio) {
                permisos=Permisos(elemento);
                System.out.println(n+"-"+"\t"+ permisos +"\t"+elemento.length()+"\t"+formatter.format(elemento.lastModified())+"\t"+elemento.getName());
                n++;   
            }

            radio = lector.nextInt();
            n=1;

            if(radio==0){
                f=f.getParentFile();
            }else if(radio>0){              
                if(directorio[radio-1].canRead()){                
                    f=directorio[radio-1];
                }else{
                    System.out.println("No tienes permisos de lectura");
                }               
            }

           directorio=f.listFiles();

        }while (radio != -1);

        lector.close();                   
    }

    private static String Permisos(File elemento){
        String resultado="";
        if(elemento.isDirectory()){
            resultado="d";
        }else{
            resultado+="-";
        }
        if(elemento.canRead()){
            resultado+="r";
        }else{
            resultado+="-";
        }
        if(elemento.canWrite()){
            resultado+="w";
        }else{
            resultado+="-";
        }
        if(elemento.canExecute()){
            resultado+="x";
        }else{
            resultado+="-";
        }
        return resultado;

    }
}
