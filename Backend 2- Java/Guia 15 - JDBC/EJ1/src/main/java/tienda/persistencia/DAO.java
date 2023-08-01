package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gonzalo Bravo
 */
public abstract class DAO {

    //
    public Connection conexion = null;
    public ResultSet resultado = null;
    public Statement sentencia = null;
    //Variables para crear la conexion.

    //
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    // Crea variables constantes, las cuales nunca cambian.

    public void conectarBaseDeDatos() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
            //Si esto tiene un error, tira el throw.
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public void desconectarBase() throws SQLException{
        try {
            //Si pasa esto. Quiere decir que tiene algo adentro, asique cierro la conexion.
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public void insertarModificarEliminar(String sql) throws SQLException, ClassNotFoundException{
        try {
            conectarBaseDeDatos();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql); //Ejecuta la sentencia. Que nos va a llegar de sql.
        } catch (ClassNotFoundException | SQLException ex) {
            
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    public void consultarBaseDeDatos(String sql) throws SQLException, ClassNotFoundException{
        try {
            conectarBaseDeDatos();
            sentencia = conexion.createStatement(); //Preparo una sentencia.
            resultado = sentencia.executeQuery(sql); //En resultado albergo el resultado de la consulta.
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }
}
