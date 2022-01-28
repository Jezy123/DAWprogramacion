package Tema5;

public class TestHeater {
    public static void main(String[] args) {
        Heater estufa= new Heater(22, 15, 35);
        estufa.cooler();
        estufa.warmer();
        estufa.setIncrement(8);
        estufa.setIncrement(3);
        estufa.cooler();
        estufa.cooler(); 
        estufa.cooler();
   
    }
}
