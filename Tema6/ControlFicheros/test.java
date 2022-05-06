package ControlFicheros;

import java.io.IOException;

import jsonFicheros.escribirJson;

public class test {
    public static void main(String[] args) throws IOException {
        Cliente ramon= new Cliente("001", "nombre", "apellido", "id1"," email@1");
        Cliente ramon2= new Cliente("011", "Ramon", "apellido", "id1"," email@1");
        Cliente ramon3= new Cliente("111", "Julian", "apellido", "id1"," email@1");
       
        Cliente[] arrat={ramon,ramon2,ramon3};
        escribirJson.writeJson(arrat);
        ControlFormato.read("/home/INFORMATICA/alu10204910/Escriptori/carpeta nova 3/Repositori/DAWprogramacion-1/Tema6/ControlFicheros/Clientes.txt");
        System.out.println("Funciona");
    }
}
