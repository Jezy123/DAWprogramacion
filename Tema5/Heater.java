package Tema5;

public class Heater {
    
    private double temperature;
    private double min;
    private double max;
    private double increment;


    public Heater(double temperature, double min, double max){
        this.temperature=temperature;
        increment=5;
        this.min= min;
        this.max= max;
    }

    //Aumenta el valor de la temperatura
    public void warmer(){
        if(this.temperature+increment<max){
            this.temperature=this.temperature+this.increment;
        }else{
            System.out.println("Error: No se puede superar el valor máximo");
        }
    }

    //Reduce el valor de la temperatura
    public void cooler(){
        if(this.temperature-increment>min){
            this.temperature=this.temperature-this.increment;
        }else{
                System.out.println("Error: no se puede superar el valor minimo");
        }
    }

    //Modifica el valor de incremento de la temperatura
    public void setIncrement(double increment){
        if(increment>1 && increment<5){
        this.increment=increment;
        }else{
        System.out.println("Error: El incremento debe estar comprendido entre los valores 1 y 5");
        }
    }
    
}
