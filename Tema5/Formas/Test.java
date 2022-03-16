package Tema5.Formas;

import java.util.ArrayList;

import Objetos.ejemplo;

public class Test {
    public static void main(String[] args) {
        Forma forma=new Forma("amarillo",3,2,"figuira");
        Rectangulo rectangulo= new Rectangulo("amarillo",3,2,"figuira", 8, 12);
        Eclipse eclipse= new Eclipse("rojo", 2, 4, "nombre1", 12, 4);
        Cuadrado cuadrado= new Cuadrado("rojo", 3, 7, "nombre2", 5);
        Circulo circulo= new Circulo("rojo", 7, -2, "nombr33", 4);
        ArrayList<Forma> arrayObj = new ArrayList<>();
        arrayObj.add(rectangulo);
        arrayObj.add(eclipse);
        arrayObj.add(cuadrado);
        arrayObj.add(circulo);

       for (Forma item : arrayObj) {
            item.mover(3, 5);
            item.setColor("azul");
            item.imprimir();
        }
    }
}
