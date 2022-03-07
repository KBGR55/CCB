package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author K.G 
 */

public class BaseDatosConexion {

    public Connection conexion;
    private boolean verificar;

    public BaseDatosConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bduccb", "root", "");
            this.verificar = true;
        } catch (ClassNotFoundException | SQLException ex) {
            this.verificar = false;
        }
    }

    public boolean getVerificar() {
        return verificar;
    }

    public void setVerificar(boolean verificar) {
        this.verificar = verificar;
    }

}
