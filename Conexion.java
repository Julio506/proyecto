package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ediso
 */
public class Conexion {

    // Método para conectar a la base de datos
    public static Connection conectar() {
        try {
            // Configura la URL de conexión con los parámetros necesarios
            String url = "jdbc:mysql://localhost/bd_sistema_ventas?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
            String usuario = "Diego"; // Cambia por el nombre exacto del usuario en MySQL
            String contraseña = "1234"; // Cambia por la contraseña correcta

            // Intenta conectar a la base de datos
            Connection cn = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa a la base de datos");
            return cn; // Retorna la conexión si es exitosa
        } catch (SQLException e) {
            // Imprime el error en caso de que la conexión falle
            System.out.println("Error en la conexión local: " + e);
        }
        return null; // Retorna null si no se pudo conectar
    }
}
