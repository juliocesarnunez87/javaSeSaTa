package ar.com.eduit.curso.java.repositories.interfaces;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import java.util.List;
public interface I_AlumnoR {
    void save(Alumno alumno);
    void remove(Alumno alumno);
    void update(Alumno alumno);
    List<Alumno> getAll();
    Alumno getById(int id);
    List<Alumno> getByApellido(String apellido);
    List<Alumno> getLikeApellido(String apellido);
    List<Alumno> getLikeApellidoNombre(String apellido, String nombre);
    List<Alumno> getByCurso(int idCurso);
    List<Alumno> getByCurso(Curso curso);
}