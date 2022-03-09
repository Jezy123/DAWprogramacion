package Tema5.Cutrecloud;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;



public class Media implements Interface {
    
    private int idMedia; /*clave primaria*/
    private String nombre; /*Unico*/
    private String contenido; 
    private String formato;
    private Usuario usuario;

    private static int idUnico;

    public static ArrayList<Media> arrayMedia = new ArrayList<Media>();

    private static int numero;

    private Media(int idMedia, String nombre, String formato, String contenido, Usuario usuario) {
        this.idMedia = idMedia;
        this.nombre = nombre;
        this.contenido = contenido;
        this.formato = formato;
        this.usuario = usuario;
        arrayMedia.add(this);
    }
    
    public static Media crearMedia(String nombre, String contenido, String formato,Usuario usuario){
        if(comprobarUsuario(usuario)==true){   //Comprueba si existe el ususario
            if(comprobarNombre(nombre) == true){ //Comprueba si es unico el nombre
                idUnico();
                Media media= new Media(idUnico, nombre, contenido, formato, usuario);
                return media;
            }
            return null;
        
        }
        return null;
    }
    


    private static boolean comprobarUsuario(Usuario usuario){

        ArrayList<Usuario> arraydeUsuarioCreados = Usuario.getArrayUsuario();

        for (int i = 0 ;i < arraydeUsuarioCreados.size();i++) {
            if(arraydeUsuarioCreados.get(i).equals(usuario)){
                return true;
            }
        }
        return false;
       
    }


    private static boolean comprobarNombre (String nombre){

        for (int i = 0 ;i < arrayMedia.size();i++){
            if(arrayMedia.get(i).nombre.equals(nombre)){
                return false; //Debe se único en caso de ser verdad el nombre estara duplicado
            }
        }
        return true;
       
    }

    private static int idUnico(){
        idUnico++;
        return idUnico;
    }

    public static void eliminarMedia(String nombre){
        for (Media item : arrayMedia){
            if(item.nombre.equals(nombre)){
                arrayMedia.remove(item);
                break;
            }
        }

        /*Iterator<Media>iterator = list.iterator();
        While(iterator.hasNext()){
            Media elemento = iterator,next();
            if (elemento.tipo.equals(type){
                iterator.remove()
            }
        }*/
    }
    
    public static void eliminarMediaFormato(String formato){
        for (int i = 0 ;i < arrayMedia.size();i++) {
            if(arrayMedia.get(i).formato.equals(formato)){
                arrayMedia.remove(i);
                i--;
            }
        }
    }

    public static void eliminarMediaDelUsuario(Usuario usuarioPasado){
        
        for (int i = 0 ;i < arrayMedia.size(); i++) {
            if(arrayMedia.get(i).usuario.equals(usuarioPasado)){
                arrayMedia.remove(i);
                i--;
            }
        }
    }

    @Override
    public String parseXML() {
        String xml="<media>" + "<idMedia>"+idMedia+"</idMedia> \n" + "<contenido>"+ contenido +"</contenido> \n"+
        "<formato>"+formato+"</formato> \n" + usuario.parseXML()+"</media>";
        
        return xml; 
  
    }

    public void writterXML() {

        String contenido=parseXML();
        PrintWriter fichero= null;

        try {
            
            fichero = new PrintWriter("Tema5/Cutrecloud/Usuarios/FicheroMedia"+numero+".txt");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        numero++;
                
        Objects.requireNonNull(fichero).println(contenido);
        fichero.close();


    }
}
