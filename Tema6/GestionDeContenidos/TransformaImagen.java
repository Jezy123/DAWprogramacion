import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;


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
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_n.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);
        int c;

        for(int i = 0; i<this.f.length();i++){
            c = reader.read();
            if (i<=54){
                writer.write(c);
            }else{
            
                writer.write(255-c);
            }
        }
        reader.close();
        writer.close();
 
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_o.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);
        int c;

        for(int i = 0; i<this.f.length();i++){
            c = reader.read();
            if (i<=54){
                writer.write(c);
            }else{            
                writer.write(c/2);
            }
        }
        reader.close();
        writer.close();
    }

    

    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_b.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);
        int byte0=0;
        int byte1=0;
        int byte2=0;
        int media;

        for(int i = 0; i<this.f.length();i++){
            if (i<=54){
                byte0 = reader.read();
                writer.write(byte0);
            }else{            
                byte0 = reader.read();
                byte1 = reader.read();
                byte2 = reader.read();
                media= (byte0+byte1+byte2)/3;
                for(int x = 0; x<3;x++){
                    writer.write(media);
                }
            }
        }
        reader.close();
        writer.close();
    }

}