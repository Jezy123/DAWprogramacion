package Tema5.Cutrecloud;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.ObjectInputFilter.Status;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.Objects;

import javax.crypto.CipherInputStream;

public class Usuario implements Interface {
    
    private int id; /*clave principal*/
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
        String xml="<usuario>\n" + "<id>"+id+"</id>\n" +"<email>"+email+"</email>\n"+ "<password>"+ password +"</password>\n"+
        "</usuario>";
        
        return xml; 
    }   

    public void writterXML() {

        String contenido=parseXML();
        PrintWriter fichero= null;

        try {
            
            fichero = new PrintWriter("Tema5/Cutrecloud/Usuarios/FicheroUsuario"+getId()+".txt");

        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        } 
                
        Objects.requireNonNull(fichero).println(contenido);
        fichero.close();


    }

    public static void recuperarUsuario(){
        
        String emailRecuperado="";
        String passwordRecuperado="";
        BufferedReader reader;
        int reiterador=1;
        File archivo=new File ("Tema5/Cutrecloud/Usuarios/FicheroUsuario"+reiterador+".txt");
        while(archivo.exists()){
            try{
            
                reader=new BufferedReader(new FileReader("Tema5/Cutrecloud/Usuarios/FicheroUsuario"+reiterador+".txt"));
                String line= reader.readLine();

                while(line!=null){
                
                    if(line.contains("@")){
                 
                        emailRecuperado=line.substring(7, cierre(line));
                    }
                    if(line.contains("password")){
                    
                        passwordRecuperado=line.substring(10, cierre(line));
                    }

                    line=reader.readLine();
                }

                crearUsuario(emailRecuperado, passwordRecuperado);

                reader.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            reiterador++;
            archivo=new File ("Tema5/Cutrecloud/Usuarios/FicheroUsuario"+reiterador+".txt");
        }
       
        
    }

    private static int cierre(String line){
        int x=0;
        for (int i=2;i<line.length();i++){
            if(line.charAt(i)=='<'){
                x=i;
                break;
            }
        }
        return x;
    }

}
