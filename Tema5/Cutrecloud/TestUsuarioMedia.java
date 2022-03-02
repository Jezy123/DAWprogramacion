package Tema5.Cutrecloud;

public class TestUsuarioMedia {
    public static void main(String[] args) {
        Usuario usuario1= Usuario.crearUsuario("email@","contra");
        Usuario usuario2= Usuario.crearUsuario("email@","contra");
        Usuario usuario3= Usuario.crearUsuario("miremos@","contra");
        Usuario usuario4= Usuario.crearUsuario("alfredo@","contra");
        Media media1= Media.crearMedia("remix","VGA","La vida de alfredo",usuario1);
        Media media2= Media.crearMedia("remix","VGA","La vida de alfredo",usuario3);
        Media media3= Media.crearMedia("TRoll","VGA","La vida de alfredo",usuario4);
        Media media4= Media.crearMedia("Alfedos","DVD","La vida de alfredo",usuario4);
        Media media5= Media.crearMedia("LosLocos","VGA","La vida de alfredo",usuario4);
        usuario1.parseXML();
    }
}


/* Eliminar un media por nombre del fichero 
Eliminar todos media de un tipo concreto
Eliminar un usuario por email ---> Elimina tambien su media
Eliminar los usuarios de un dominio (@gmail)*/