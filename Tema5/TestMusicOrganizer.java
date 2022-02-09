package Tema5;

public class TestMusicOrganizer {
    public static void main(String[] args) {
        MusicOrganizer operador= new MusicOrganizer();
        operador.addFile("Samba");
        operador.addFile("Ratonero");
        operador.addFile("Bailarin");
        operador.addFile("Procesador");
        operador.checkIndex(3);
        operador.removeFile(2);
        operador.listFile(2);;
    }
}
