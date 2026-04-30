import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExempleConnexioMYSQL {

    private static Connection connexio;
    public final static String USER = "root";
    public final static String PASSW = "";
    // He puesto la URL completa aquí arriba para que el código de abajo sea más limpio
    public final static String URL = "jdbc:mysql://localhost:3306/?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public static void main(String[] args) {
        try {
            // Conectamos usando la variable URL que definimos arriba
            connexio = DriverManager.getConnection(URL, USER, PASSW);
            System.out.println("Server Connectat");

        } catch (SQLException e) {
            System.out.println("No s'ha pogut connectar a la meva base de dades");
            e.printStackTrace();
        } finally {
            try {
                if (connexio != null && !connexio.isClosed()) {
                    connexio.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}