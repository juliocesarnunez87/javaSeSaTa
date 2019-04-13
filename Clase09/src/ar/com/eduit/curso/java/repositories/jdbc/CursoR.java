package ar.com.eduit.curso.java.repositories.jdbc;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enumerados.Dias;
import ar.com.eduit.curso.java.enumerados.Turnos;
import ar.com.eduit.curso.java.repositories.interfaces.I_CursoR;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class CursoR implements I_CursoR {
    private Connection conn;
    public CursoR(Connection conn) {
        this.conn = conn;
    }
    @Override public void save(Curso curso) {
        if(curso==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
            "insert into cursos (titulo,profesor,dia,turno) values (?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) curso.setId(rs.getInt(1));
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public void remove(Curso curso) {
        if(curso==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete from cursos where id=?")){
            ps.setInt(1, curso.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public void update(Curso curso) {
        if(curso==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "update cursos set titulo=?, profesor=?, dia=?, turno=? where id=?")) {
            ps.setString(1, curso.getTitulo());
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia().toString());
            ps.setString(4, curso.getTurno().toString());
            ps.setInt(5, curso.getId());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }
    @Override public Curso getById(int id) {
        List<Curso>lista=getAll()
                .stream()
                .filter(p->p.getId()==id)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }
    @Override public List<Curso> getAll() {
        String query="select * from cursos";
        List<Curso>lista=new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery(query)){
            while(rs.next()){
                lista.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("profesor"),
                        Dias.valueOf(rs.getString("dia").toUpperCase()),
                        Turnos.valueOf(rs.getString("turno").toUpperCase())
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return lista;
    }
    @Override public List<Curso> getByTitulo(String titulo) {
        return getAll()
                .stream()
                .filter(p->p.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }
    @Override public List<Curso> getLikeTitulo(String titulo) {
        return getAll()
                .stream()
                .filter(p->p.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override public List<Curso> getByProfesor(String profesor) {
        return getAll()
                .stream()
                .filter(p->p.getProfesor().equalsIgnoreCase(profesor))
                .collect(Collectors.toList());
    }
    @Override public List<Curso> getLikeProfesor(String profesor) {
        return getAll()
                .stream()
                .filter(p->p.getProfesor().toLowerCase().contains(profesor.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override public List<Curso> getByDia(Dias dia) {
        return getAll()
                .stream()
                .filter(p->p.getDia().equals(dia))
                .collect(Collectors.toList());
    }
    @Override public List<Curso> getByTurno(Turnos turno) {
        return getAll()
                .stream()
                .filter(p->p.getTurno().equals(turno))
                .collect(Collectors.toList());
    }
    @Override public Curso getByAlumno(Alumno alumno) {
        List<Curso> lista = getAll()
                .stream()
                .filter(p->p.getId()==alumno.getIdCurso())
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?null:lista.get(0);
    }

    @Override
    public List<Curso> getLikeTituloProfesorDiaTurno(String titulo, String profesor, Dias dia, Turnos turno) {
        return getAll()
                .stream()
                .filter(p->p.getTitulo().toLowerCase().contains(titulo.toLowerCase())
                    && p.getProfesor().toLowerCase().contains(profesor.toLowerCase())
                    && p.getDia().equals(dia)
                    && p.getTurno().equals(turno))
                .collect(Collectors.toList());
    }
}