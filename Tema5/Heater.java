package Tema5;

public class Heater {
    
    private double temperature;
    private double min;
    private double max;
    private double increment;


    public Heater( double min, double max){
        this.temperature=15;
        increment=5;
        this.min= min;
        this.max= max;
    }

    public double getTemperature() {
        return temperature;
    }

    //Aumenta el valor de la temperatura
    public void warmer(){
        if(this.temperature+increment<=max){
            this.temperature=this.temperature+this.increment;
        }
    
    }


    //Reduce el valor de la temperatura
    public void cooler(){
        if(this.temperature-increment>=min){
            this.temperature=this.temperature-this.increment;
        }
    }


    //Modifica el valor de incremento de la temperatura
    public void setIncrement(double increment){
        if(increment>=1 && increment<=5){
        this.increment=increment;
        }
    }
    
}
