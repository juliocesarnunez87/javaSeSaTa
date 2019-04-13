package ar.com.eduit.curso.java.test;
import ar.com.eduit.curso.java.conector.ConnectorMySQL;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enumerados.Dias;
import ar.com.eduit.curso.java.enumerados.Turnos;
import ar.com.eduit.curso.java.repositories.jdbc.AlumnoR;
import ar.com.eduit.curso.java.repositories.jdbc.CursoR;
import java.sql.Connection;
import java.sql.Statement;
public class TestConnector {
    public static void main(String[] args) throws Exception {
        /*
        String query="insert into cursos (titulo,profesor,dia,turno) values "
                + "('Java','Gomez','Lunes','Tarde')";
        Connection conn=ConnectorMySQL.getConnection();
        Statement st=conn.createStatement();
        st.execute(query);
        
        ConnectorMySQL.getConnection().createStatement().execute(
                "insert into cursos (titulo,profesor,dia,turno) values "
                        + "('PHP','Gimenez','Martes','Noche')"
        );
        */
        AlumnoR ar=new AlumnoR(ConnectorMySQL.getConnection());
        Alumno alumno=new Alumno("Ana","Mendez",23,1);
        //ar.save(alumno);
        //System.out.println(alumno);
        System.out.println("*************************************************");
        
        //System.out.println(ar.getById(5));
        
        //ar.remove(ar.getById(4));
        /*
        alumno=ar.getById(3);
        if(alumno!=null){
            alumno.setNombre("Luciana");
            alumno.setApellido("Riera");
            ar.update(alumno);
        }
        */
        ar.getAll().forEach(System.out::println);
        //ar.getByApellido("mendez").forEach(System.out::println);
        //ar.getLikeApellido("mi").forEach(System.out::println);
        //ar.getLikeApellidoNombre("so", "l").forEach(System.out::println);
        //ar.getByCurso(1).forEach(System.out::println);
        
        CursoR cr=new CursoR(ConnectorMySQL.getConnection());
        Curso curso=new Curso("HTML", "Gonsalez", Dias.LUNES, Turnos.TARDE);
        cr.save(curso);
        System.out.println(curso);
        
        System.out.println("*************************************************");
        
        //System.out.println(cr.getById(2));
        
        cr.remove(cr.getById(4));
        curso=cr.getById(5);
        if(curso!=null){
            curso.setTitulo("Reposteria");
            curso.setDia(Dias.VIERNES);
            cr.update(curso);
        }
        
        cr.getAll().forEach(System.out::println);
        //cr.getByTitulo("java").forEach(System.out::println);
        //cr.getLikeTitulo("j").forEach(System.out::println);
        //cr.getByProfesor("Gomez").forEach(System.out::println);
        //cr.getLikeProfesor("m").forEach(System.out::println);
        //cr.getByDia(Dias.LUNES).forEach(System.out::println);
        //cr.getByTurno(Turnos.NOCHE).forEach(System.out::println);
        //cr.getLikeTituloProfesorDiaTurno("", "", Dias.MARTES, Turnos.NOCHE).forEach(System.out::println);
        //System.out.println(cr.getByAlumno(alumno));
        
    }
}
