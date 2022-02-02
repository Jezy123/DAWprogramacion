package Tema5;

public class TestMail {
    public static void main(String[] args) {
       
        MailItem mensaje=new MailItem("juan","Paco","leones", "Mensaje Prueba: sabias que hay leones");
        MailServer servidor= new MailServer();
        MailClient cliente1= new MailClient(servidor, "juan");
        MailClient cliente2= new MailClient(servidor, "Paco");
        servidor.post(mensaje);
        System.out.println( servidor.howManyMailItems("Paco"));
        cliente2.printNextMailItem();
        
    
    }
    
}
