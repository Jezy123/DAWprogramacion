package Objetos;
import java.awt.Point;
 
public class Silla2 {
    private String color;
    private int numDePatas;
    private boolean respaldo;
    private int nivelDeComodidad;
    private String material;
    private Point punto;
    
    public String getColor() {
        return color;
    }
    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }
    public int getNumDePatas() {
        return numDePatas; 
    }
    public void setNumDePatas(int nuevonumDePatas) {
        this.numDePatas = nuevonumDePatas;
    }
    public boolean isRespaldo() {
        return respaldo;
    }
    public void setRespaldo(boolean respaldo) {
        this.respaldo = respaldo;
    }
    public int getNivelDeComodidad() {
        return nivelDeComodidad;
    }
    public void setNivelDeComodidad(int nivelDeComodidad) {
        this.nivelDeComodidad = nivelDeComodidad;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Point getPunto() {
        return punto;
    }
    public void setPunto(Point punto) {
        this.punto = punto;
    }
   
}
