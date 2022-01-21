package Tema5;

public class TestTicketMachine {
    public static void main(String[] args) {
        TicketMachine ticket1= new TicketMachine();
        ticket1.prompt();
        ticket1.setPrice(10);
        ticket1.insertMoney(20);
        ticket1.printTicket();
        ticket1.showPrice();
        ticket1.empty();
        ticket1.showPrice();
        
    }
}
