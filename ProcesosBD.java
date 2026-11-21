import java.sql.*;

public class ProcesosBD extends ConexionBD {

    protected PreparedStatement pstm = null;
    protected String sql = "";
    protected Alumno alumno;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void insertarRegistro() throws Exception {

        sql = "INSERT INTO Alumno (cuenta, aPaterno, aMaterno, nombre, licenciatura, direccion, telefono, semestre) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = optenerConexion();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, alumno.getCuenta());
            pstm.setString(2, alumno.getPaterno());
            pstm.setString(3, alumno.getMaterno());
            pstm.setString(4, alumno.getNombre());
            pstm.setString(5, alumno.getLicenciatura());
            pstm.setString(6, alumno.getDireccion());
            pstm.setString(7, alumno.getTelefono());
            pstm.setInt(8, alumno.getSemestre());

            int resultado = pstm.executeUpdate();

            if (resultado > 0) {
                System.out.println("Registro insertado correctamente");
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar los datos");
            e.printStackTrace();
            throw e;
        }
    }
}
