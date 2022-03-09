package Tema5.Cutrecloud;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class UsuarioInput {
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
  

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("0. Crear un usuario nuevo");
            System.out.println("1. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 0:
                    salir=true;
                    break;

                    case 1:

                        System.out.println("Introduce un email");
                        String email=sn.next();
                        System.out.println("Introduce una contraseña");
                        String password=sn.next();
                        Usuario.crearUsuario(email, password);
                        
                    break;

                    default:
                        System.out.println("Solo números entre 0 y 1");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        sn.close();
 
    }


 
}

