
import java.io.File;


public class Ejercicio2_1 {
    public static void main(String[] args) throws Exception {

        File f = new File("/home/INFORMATICA/alu10204910/Escriptori/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);
        ti.transformaNegativo();
        ti.transformaOscuro();
        ti.transformaBlancoNegro();

    }

}

