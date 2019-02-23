package clase02;
public class Empleado {
    private int nroLegajo;
    private String nombre;
    private String apellido;
    private float sueldoBasico;

    public Empleado(int nroLegajo, String nombre, String apellido, float sueldoBasico) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nroLegajo=" + nroLegajo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + '}';
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
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

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    
    
}