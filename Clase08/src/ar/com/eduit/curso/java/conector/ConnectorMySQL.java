package ar.com.eduit.curso.java.conector;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectorMySQL {
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/colegio";
    private static String user="root";
    private static String pass="";
    private static Connection conn=null;
    private ConnectorMySQL(){}
    public static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url, user, pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    }
}
