package Tema5.MusicOrganizer5;

public class TestMusicOrganizerv5 {
    public static void main(String[] args) {
        MusicOrganizer reproductor= new MusicOrganizer();
        reproductor.addFile("filename");
        reproductor.addFile("filenamer");
        reproductor.findInTitle("file");
    }
}
