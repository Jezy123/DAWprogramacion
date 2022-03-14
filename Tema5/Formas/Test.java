package Tema5.Formas;

import Objetos.ejemplo;

public class Test {
    public static void main(String[] args) {
        Forma forma=new Forma("amarillo",3,2,"figuira");
        Rectangulo rectangulo= new Rectangulo("amarillo",3,2,"figuira", 8, 12);
        Eclipse eclipse= new Eclipse("rojo", 2, 4, "nombre1", 12, 4);
        Cuadrado cuadrado= new Cuadrado("rojo", 3, 7, "nombre2", 5);
        Circulo circulo= new Circulo("rojo", 7, -2, "nombr33", 4);
        int x=3;
        int y=2;
        for(int i=0;i<100;i++){
            rectangulo.setColor("azul");
            rectangulo.mover(x, y);
            eclipse.setColor("azul");
            eclipse.mover(x, y);
            cuadrado.setColor("azul");
            cuadrado.mover(x, y);
            circulo.setColor("azul");
            circulo.mover(x, y);
        }
    }
}
