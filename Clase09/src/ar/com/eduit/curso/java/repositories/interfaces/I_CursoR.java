package ar.com.eduit.curso.java.repositories.interfaces;
import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enumerados.Dias;
import ar.com.eduit.curso.java.enumerados.Turnos;
import java.util.List;
public interface I_CursoR {
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    Curso getById(int id);
    List<Curso>getAll();
    List<Curso>getByTitulo(String titulo);
    List<Curso>getLikeTitulo(String titulo);
    List<Curso>getByProfesor(String profesor);
    List<Curso>getLikeProfesor(String profesor);
    List<Curso>getByDia(Dias dia);
    List<Curso>getByTurno(Turnos turno);
    Curso getByAlumno(Alumno alumno);
    List<Curso>getLikeTituloProfesorDiaTurno(String titulo,String profesor,Dias dia,Turnos turno);
}