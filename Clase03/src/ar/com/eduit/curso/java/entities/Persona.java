package ar.com.eduit.curso.java.entities;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;
   
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    //public abstract void saludar();
    //Los métodos abstractos solo pueden existir en clases abstractas.
    //La implementación del método la colocan las clase hijas
    
    public void saludar(){
        System.out.println("Hola soy una persona");
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + '}';
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
    
}
