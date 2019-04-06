package ar.com.eduit.curso.java.repositories.jdbc;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.interfaces.I_AlumnoR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class AlumnoR implements I_AlumnoR{
    private Connection conn;
    public AlumnoR(Connection conn) {
        this.conn = conn;
    }    
    @Override
    public void save(Alumno alumno) {
        if(alumno==null) return;
        //String query="insert into alumnos (nombre,apellido,edad,idCurso) values "
        //        + "('"+alumno.getNombre()+"','"+alumno.getApellido()+"',"
        //        + alumno.getEdad()+","+alumno.getIdCurso()+")";
        String query="insert into alumnos (nombre,apellido,edad,idCurso) values (?,?,?,?)";
        try (PreparedStatement ps=conn.prepareStatement(
                query,PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) alumno.setId(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Alumno alumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getAll() {
        String query="select * from alumnos";
        List<Alumno> lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(query)){
            while(rs.next()){
                lista.add(new Alumno(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad"),
                        rs.getInt("idCurso")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return lista;
    }

    @Override
    public Alumno getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Alumno>getList(Stream<Alumno> stream){
        List<Alumno>lista=new ArrayList();
        stream.forEach(lista::add);
        return lista;
    }
    
    @Override
    public List<Alumno> getByApellido(String apellido) {
        return getList(getAll()
                .stream()
                .filter(p->p.getApellido().equalsIgnoreCase(apellido))
        );
    }

    @Override
    public List<Alumno> getLikeApellido(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getLikeApellidoNombre(String apellido, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getByCurso(int idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> getByCurso(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}