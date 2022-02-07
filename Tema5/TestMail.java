package Tema5;

public class TestMail {
    public static void main(String[] args) {
       
    
        MailServer servidor= new MailServer();
        MailClient cliente1= new MailClient(servidor, "juan");
        MailClient cliente2= new MailClient(servidor, "Paco");
        MailClient cliente3=new MailClient(servidor, "Luis");

        cliente1.sendMailItem("Paco", "Leones", "Sabes que en africa hay leones");
        cliente2.forwarMailItem("Luis");

        cliente3.printNextMailItem();

        
    
    }
    
}
