package jsonFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import ControlFicheros.Cliente;

public class escribirJson {
   
    public static void writeJson(Cliente[] clientes) throws IOException{
        ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream("./ControlFicheros/Clientes2.txt"));       
        final Gson gson = new Gson();
        
        for (Cliente cli : clientes) {  
        f.writeObject(gson.toJson(cli));
        }
        f.close();
    }

    public static void readJson(String direccion) throws IOException{
        ObjectInputStream f = new ObjectInputStream(new FileInputStream(direccion));
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
