package Tema5.Formas;
import java.awt.Point;


public class Forma {
    private String color;
    private Point center;
    private String name;

    public Forma(String color, int x , int y, String name) {
        this.color = color;
        this.center = new Point (x,y);
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Imprimir(){
        System.out.println("color:"+color+"\n centro:"+center.x + center.y +"\n nombre:"+ name);
    }

    public void mover(int x, int y){
        this.center=new Point(x,y);

    }
}
