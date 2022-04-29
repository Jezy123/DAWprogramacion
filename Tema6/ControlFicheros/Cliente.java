package ControlFicheros;

public class Cliente extends Persona{

    private String id;
    private String email;
    
    public Cliente(String nif, String nombre, String apellido, String id,String email) {
        super(nif, nombre, apellido);
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return getId()+"    "+getNif()+"    "+getNombre()+"   "+getApellido()+"    "+getEmail();
      }
}
