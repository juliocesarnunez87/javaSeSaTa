package ar.com.eduit.curso.java.repositories.jdbc;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.interfaces.I_AlumnoR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
    @Override public void remove(Alumno alumno) {
        if(alumno==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from alumnos where id=?")){
            ps.setInt(1, alumno.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public void update(Alumno alumno) {
        if(alumno==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "update alumnos set nombre=?, apellido=?, edad=?, idCurso=? where id=?"
        )){
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.setInt(5, alumno.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override  public List<Alumno> getAll() {
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
    @Override public Alumno getById(int id) {
        List<Alumno>lista=getAll()
                .stream()
                .filter(p->p.getId()==id)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    @Override public List<Alumno> getByApellido(String apellido) {
        return getAll()
                .stream()
                .filter(p->p.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    @Override public List<Alumno> getLikeApellido(String apellido) {
        return getAll()
                .stream()
                .filter(p->p.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override public List<Alumno> getLikeApellidoNombre(String apellido, String nombre) {
        return getAll()
                .stream()
                .filter(p->p.getApellido().toLowerCase().contains(apellido.toLowerCase())
                 && p.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    @Override public List<Alumno> getByCurso(int idCurso) {
        return getAll()
                .stream()
                .filter(p->p.getIdCurso()==idCurso)
                .collect(Collectors.toList());
    }
    @Override public List<Alumno> getByCurso(Curso curso) {
        return getByCurso(curso.getId());
    }
}