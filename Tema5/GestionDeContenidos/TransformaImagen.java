import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.ArrayList;

public class TransformaImagen {

    File f = null;

    public TransformaImagen(File fEnt) throws Exception{

        // Control de existencia del fichero y control de la extensión .bmp (sacar
        // mensajes de error)
        if(".bmp".equals(fEnt.getPath().substring(fEnt.getPath().length()-4))){
            f=fEnt;
        }else{
            throw new Exception("Exception message");
        }


    }

    public void transformaNegativo() throws IOException {

        // Transformar a negativo y guardar como *_n.bmp
        String nombre=f.getName()+"_b.bmp";
       
        FileInputStream f_in=new FileInputStream(f);
        FileOutputStream f_out=new FileOutputStream(nombre);
        byte[] buffer=new byte[48];
        int num =f_in.read(buffer);
 
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp

        

    }

    

    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

    }

    private String getNombreSinExtension() {

        //Devuelve el nombre del archivo f sin extensión

        

    }

}