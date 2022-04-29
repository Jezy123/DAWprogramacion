package ControlFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaCliente {

    public static void write(Cliente[] clientes) throws IOException{
        FileWriter writer= new FileWriter("./ControlFicheros/Clientes.txt");
        BufferedWriter bWriter = new BufferedWriter(writer);
        String personas="";
        for (Cliente cli : clientes) {
           personas= personas +cli.getId()+","+ cli.getNif()+","+cli.getNombre()+","+cli.getApellido()+","+cli.getEmail()+"\n";
        }
        bWriter.write(personas);
        bWriter.close();

    }

    public static List<Cliente> read(String dirrecion) throws IOException{
        FileReader reader = new FileReader(dirrecion);
        BufferedReader breader = new BufferedReader(reader);
        List<Cliente> clientesLista = new ArrayList<Cliente>();
        String cliente=breader.readLine();

        while(cliente != null){

            String[] partes=cliente.split(",");
            clientesLista.add(new Cliente(partes[0], partes[1], partes[2], partes[3], partes[4]));
            cliente=breader.readLine();
        }

        breader.close();
        return clientesLista;
       
    }
}
