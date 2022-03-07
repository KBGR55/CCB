package Controlador;

import Modelo.BaseDatosConexion;
import Modelo.Usuario;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author K.G 
 */
public class ControladorUsuariosBD {

    public BaseDatosConexion conI = new BaseDatosConexion();

    public void guardarUsuario(Usuario u) {
        int fila;
        PreparedStatement prepSt;
        try {
            String sql = "insert into usuarios(Nombre,Clave,Email) values (?,?,?)";
            prepSt = conI.conexion.prepareStatement(sql);
            prepSt.setString(1, u.getNombre());
            prepSt.setString(2, u.getClave());
            prepSt.setString(3, u.getEmail());
            fila = prepSt.executeUpdate();
            if (fila > 0) {
                System.out.println("Se ha insertado la fila correctamente");
            }
            prepSt.close();
            conI.conexion.close();
        } catch (SQLException e) {
            System.out.println("Error en la sentencia SQL, no se pudo insertar" + e.getMessage());
        }
    }

    public boolean buscarUsuario(String correo, String claveIngresada) {
        boolean valido = false;
        try {
            String buscar = "SELECT Clave,Nombre FROM usuarios WHERE Email = '" + correo + "' && Clave = '" + claveIngresada + "'";
            PreparedStatement prepSt = conI.conexion.prepareStatement(buscar);
            ResultSet resultado = prepSt.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("Nombre");
                mensaje(false, "Corecto", "/Vista/Imagen/Correcto.png", "Bienvenid@ " + nombre + " ");
                valido = true;
            } else {
                mensaje(false, "Error", "/Vista/Imagen/Error.png", "El usuario no ha sido encontrado, revisar los datos ingresados...");
            }
        } catch (HeadlessException | SQLException e) {
            mensaje(false, "Error", "/Vista/Imagen/Error.png", "Ocurrio un error !!!");
        }
        return valido;
    }

    public boolean buscarCorreoExistente(String correo) {
        boolean valido = true;
        try {
            String buscar = "SELECT Email FROM usuarios WHERE Email = '" + correo + "'";
            PreparedStatement prepSt = conI.conexion.prepareStatement(buscar);
            ResultSet resultado = prepSt.executeQuery();
            if (resultado.next()) {
                String correoEnUso = resultado.getString("Email");
                valido = false;
                mensaje(valido, "Ingreso de datos ", "/Vista/Imagen/Error.png", "El correo " + correoEnUso + " ya esta en uso");
            }
        } catch (HeadlessException | SQLException e) {
            mensaje(false, "Error", "/Vista/Imagen/Error.png", "Ocurrio un error !!!");
        }
        return valido;
    }

    public void mensaje(boolean falso, String titulo, String rutaImg, String mensaje) {
        if (falso == false) {
            Icon icon = new ImageIcon(getClass().getResource(rutaImg));
            JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, icon);
        }
    }

    public String nombreUsuario(String correo, String claveIngresada) {
        String nombre = "";
        try {
            String buscar = "SELECT Nombre FROM usuarios WHERE Email = '" + correo + "' && Clave = '" + claveIngresada + "'";
            PreparedStatement prepSt = conI.conexion.prepareStatement(buscar);
            ResultSet resultado = prepSt.executeQuery();
            if (resultado.next()) {
                nombre = resultado.getString("Nombre");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no ha sido encontrado, revisar los datos ingresados...");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error!!!");
        }
        return nombre;
    }

    public boolean verificarEmail(String email) {
        Pattern patron = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+))+");
        Matcher comparar = patron.matcher(email);
        return comparar.find();
    }

    public void guardarInfo(Usuario u) {
        try {
            try (FileWriter archivo = new FileWriter("HistorialIngresoUsuarios.txt", true); BufferedWriter almacen = new BufferedWriter(archivo)) {
                LocalDate todaysDate = LocalDate.now();
                DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                almacen.write("\n | Fecha : " + todaysDate.toString() + " |\t Inicio  sesión : " + dtf2.format(LocalDateTime.now()) + " |\tUsuario: " + u.getNombre() + " |\tCorreo: " + u.getEmail());
                almacen.close();
            }
        } catch (IOException ex) {
        }
    }

    public String leerInfo() {
        String datosEnviados = "";
        try {
            FileReader archivo = new FileReader("HistorialIngresoUsuarios.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            String lineaCadena;
            while ((lineaCadena = lectura.readLine()) != null) {
                datosEnviados += lineaCadena + "\n";
            }
        } catch (IOException ex) {
        }
        return datosEnviados;
    }

}
