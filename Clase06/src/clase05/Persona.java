package clase05;
public class Persona {
    private String nombre;
    private String apellido;
    private EstadoCivil estado;
    private Genero genero;

    public Persona(String nombre, String apellido, EstadoCivil estado, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + ", genero=" + genero + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}