package Tema7;

import java.sql.*;

/**
 * TestDB
 */
public class Consulta {

    public static void main(String[] args) {
        String consulta = "SELECT * FROM cliente";
        String connectionUrl = "jdbc:mysql://192.168.204.166:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(consulta);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String[] cliente=new String[5];
                cliente[0]=rs.getString("ID");
                cliente[1]=rs.getString("Nombre");
                cliente[2]=rs.getString("Apellidos");
                cliente[3]=rs.getString("NIF");
                cliente[4]=rs.getString("email");
                System.out.println("cliente : "+ cliente[0].toString()+" "+ cliente[1].toLowerCase()+" " + cliente[2].toString()+" "+cliente[3].toString()+" "+cliente[4].toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}