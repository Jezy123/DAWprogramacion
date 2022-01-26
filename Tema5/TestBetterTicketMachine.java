package Tema5;

public class TestBetterTicketMachine {
    public static void main(String[] args) {
        TicketMachine2 ticket1=new TicketMachine2(20);
        ticket1.insertMoney(40);
        ticket1.setDiscount(30);
        ticket1.printTicket();

    }
}
                    