package Objetos;
/*Crear una clase silla, sin main, atributos color, numero de patas, si tiene respaldo o no, nivel de comodidad
y material,tienen un punto que localiza las sillas en una ubicacion con x e y,definir sus atributos de forma privada
pero desde la clase de test tienes que poder modificarlos y acceder a su valor, en la clase de prueba creamos de forma aleatoria
100 sillas  */
import java.awt.Point;

public class Silla {
    private String color;
    private int numDePatas;
    private boolean respaldo;
    private int nivelDeComodidad;
    private String material;
    private Point punto;

    public Silla(){
        
        String[]colorin={"verde","rojo", "azul","amarillo"};
        String[]materiales={"carton","metal","madera","plastico"};

        //Math random= 0 y 1 excluido el 1
        // Mathrandom*(max-min+1)-min
        color = colorin[(int)(Math.random()*(colorin.length))];
        material = materiales[(int)(Math.random()*(materiales.length))];
        int numDePatas= (int)(Math.random()*5+0);
        respaldo=false;

        if ((int)(Math.random())==1){
            respaldo=true;
        }
        nivelDeComodidad=(int)(Math.random()*10+0);
        punto=new Point((int)(Math.random()*100),(int)(Math.random()*100));
    }


    public Silla(String colorin, int patas, boolean apoyo ,int comodidad , String materiales, Point puntillo){
        color =colorin;
        numDePatas=patas;
        respaldo=apoyo;
        nivelDeComodidad=comodidad;
        material=materiales;
        punto=puntillo;

        System.out.println(material);
      
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public int getNumDePatas() {
        return numDePatas; 
    }


    public void setNumDePatas(int numDePatas) {
        this.numDePatas = numDePatas;
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
