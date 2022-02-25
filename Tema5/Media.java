package Tema5;
import java.util.ArrayList;
import java.util.List;

public class Media {
    
    private int idMedia; /*clave primaria*/
    private String nombre; /*Unico*/
    private String contenido; 
    private String formato;
    private Usuario usuario;

    private static int idUnico;

    public static ArrayList<Media> arrayMedia = new ArrayList<Media>();


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
}
