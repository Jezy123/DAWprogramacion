package Tema5;

public class TestHeater {
    public static void main(String[] args) {
        Heater calefactor= new Heater(5,25);
        calefactor.cooler();
        System.out.println( calefactor.getTemperature());
        calefactor.warmer();
        calefactor.setIncrement(8);
        calefactor.setIncrement(3);
        calefactor.cooler();
        System.out.println( calefactor.getTemperature());
        calefactor.cooler(); 
        calefactor.cooler();
   
    }
}
