package ControlFicheros;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        Cliente ramon= new Cliente("001", "nombre", "apellido", "id1"," email@1");
        Cliente ramon2= new Cliente("011", "Ramon", "apellido", "id1"," email@1");
        Cliente ramon3= new Cliente("011", "Julian", "apellido", "id1"," email@1");
       
        Cliente[] arrat={ramon,ramon2,ramon3};
        ControlFormato.write(arrat);
        ControlFormato.read("./ControlFicheros/Clientes.txt");
        System.out.println("Funciona");
    }
}
