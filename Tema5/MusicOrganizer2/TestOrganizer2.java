package Tema5.MusicOrganizer2;

import Tema5.lib.MusicOrganizer;

public class TestOrganizer2 {
    public static void main(String[] args) {
       MusicOrganizer musica= new MusicOrganizer(); 
       musica.addFile("Tiempo");
       musica.addFile("Tristeza");
       musica.addFile("Otra vez");
       musica.listAllFiles();
       musica.listMatching("vez");
       musica.findFirts("Tiempo");
    }
}
