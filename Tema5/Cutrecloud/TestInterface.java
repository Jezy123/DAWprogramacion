package Tema5.Cutrecloud;



public class TestInterface {

    public static void printXML(Interface imprimible){
        System.out.println(imprimible.parseXML());
    }

    public static void main(String[] args) {
        Usuario usuario4= Usuario.crearUsuario("alfredo@","contra");
        Media media4= Media.crearMedia("Alfedos","DVD","La vida de alfredo",usuario4);
    }
}
