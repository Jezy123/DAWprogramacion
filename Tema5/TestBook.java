package Tema5;

public class TestBook {
    public static void main(String[] args) {
        Book libro1= new Book("Sanchez", "Los miles", 63, true);
        libro1.borrow();
        libro1.setRefNumber("2301N");
        libro1.printDetail();
    }
}
