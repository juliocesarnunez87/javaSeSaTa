package ar.com.eduit.curso.java.test;
import ar.com.eduit.curso.java.conector.ConnectorMySQL;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.repositories.jdbc.AlumnoR;
import java.sql.Connection;
import java.sql.Statement;
public class TestConnector {
    public static void main(String[] args) throws Exception {
        String query="insert into cursos (titulo,profesor,dia,turno) values "
                + "('Java','Gomez','Lunes','Tarde')";
        Connection conn=ConnectorMySQL.getConnection();
        Statement st=conn.createStatement();
        st.execute(query);
        
        ConnectorMySQL.getConnection().createStatement().execute(
                "insert into cursos (titulo,profesor,dia,turno) values "
                        + "('PHP','Gimenez','Martes','Noche')"
        );
        
        AlumnoR ar=new AlumnoR(ConnectorMySQL.getConnection());
        Alumno alumno=new Alumno("Ana","Mendez",23,1);
        //ar.save(alumno);
        System.out.println(alumno);
        System.out.println("*************************************************");
        //ar.getAll().forEach(System.out::println);
        ar.getByApellido("mendez").forEach(System.out::println);
        
    }
}
