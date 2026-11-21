import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    final String USR = "root";
    final String PSWD = "123456";

    final String URLBD = "jdbc:mysql://localhost:3306/Escuela?zeroDateTimeBehavior=CONVERT_TO_NULL";

    protected Connection conn;

    public ConexionBD() {
        conn = null;
    }

    public Connection optenerConexion() throws SQLException {

        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontro el Driver de MySQL", e);
        }

        conn = DriverManager.getConnection(URLBD, USR, PSWD);

        return conn;
    }
}
