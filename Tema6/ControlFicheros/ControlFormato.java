package ControlFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ControlFormato {

    public static void write(Cliente[] clientes) throws IOException{
       ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("./ControlFicheros/Clientes.txt"));
       
        for (Cliente cli : clientes) {
          f.writeObject(cli);
        }
        f.close();
    }

    public static List<Cliente> read(String dirrecion) throws IOException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream("./FicherosConFormato/Clientes.txt"));
        List<Cliente> clientesLista = new ArrayList<Cliente>();
        Cliente c;
        try {
            while(true){
                c=(Cliente)f.readObject();
                clientesLista.add(c);
            }
        } catch (Exception e) {
            f.close();
        }
        return clientesLista;
       
    }
}
