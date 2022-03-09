package Tema5.MusicOrganizer2;
import java.util.ArrayList;

import Tema5.Cutrecloud.Interface;
import Tema5.Cutrecloud.Media;

public class Usuario implements Interface {
    
    private int id; /*clave princiopal*/
    private String email; /*unico*/
    private String password;
    private static int idUnico;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    private static ArrayList<Usuario> arrayUsuario = new ArrayList<Usuario>();

    public static ArrayList<Usuario> getArrayUsuario() {
        return arrayUsuario;
    }


    private Usuario(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
        arrayUsuario.add(this);
    }

    public static Usuario crearUsuario(String email, String password){

        if(diferenteEmail(email) == true){
            int id=idUnico();
            Usuario usuarioNuevo= new Usuario(id,email,password);
            return usuarioNuevo;
        }
        return null;

    }

    private static boolean diferenteEmail(String email){
        
        for (int i=0 ;i<arrayUsuario.size();i++) {

            if(email.equals(arrayUsuario.get(i).email)){
                return false;
            }
        }
        return true;
    }


    private static int idUnico(){
        idUnico++;
        return idUnico;
    }
    
    public static void eliminarUsuario(String emailParaEliminar){
        
        for (Usuario item : arrayUsuario){

            if(item.email.equals(emailParaEliminar)){
            
                Media.eliminarMediaDelUsuario(item);
                arrayUsuario.remove(item);
                break;
            }
        }
    }

    public static void eliminarUsuarioPorDominio(String emailPart){

        for (int i = 0 ;i < arrayUsuario.size(); i++) {

            if(arrayUsuario.get(i).email.contains(emailPart)){

                Media.eliminarMediaDelUsuario(arrayUsuario.get(i));
                arrayUsuario.remove(i);
                i--;
            }
        }

    }

    @Override
    public String parseXML() {
        String xml="<usuario>" + "<id>"+id+"</id>" + "<password>"+ password +"</password>"+
        "</usuario>";
        
        return xml; 
    }   


}
