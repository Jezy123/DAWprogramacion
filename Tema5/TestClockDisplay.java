package Tema5;

public class TestClockDisplay {
    public static void main(String[] args) {
        ClockDisplay reloj= new ClockDisplay();
        for (int i=0;i<3650;i++){
        reloj.timeTick();}
        
        System.out.println( reloj.getTime());
    }
}
