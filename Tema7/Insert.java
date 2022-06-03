package Tema7;

import java.sql.*;

/**
 * TestDB
 */
public class Insert {

    public static void main(String[] args) {
        String consulta = "insert into cliente(Nombre,Apellidos,email,NIF,ID) Values(?,?,?,?,?)";
        String connectionUrl = "jdbc:mysql://192.168.204.166:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(consulta)){
            for (int i = 0; i <1; i++) {
                ps.setString(1, "Alejandra");
                ps.setString(2, "Lozano");
                ps.setString(3, "alelozanmo@");
                ps.setString(4, "2103483f");
                ps.setInt(5, 12);
                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}