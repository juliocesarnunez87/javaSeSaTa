package ar.com.eduit.curso.java.entities;
public class Empleado extends Persona{
    int nroLegajo;
    String puesto;
    float sueldoBasico;

    public Empleado(int nroLegajo, String puesto, float sueldoBasico, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        // super() invoca el constructor de la clase padre.
        this.nroLegajo = nroLegajo;
        this.puesto = puesto;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "nroLegajo=" + nroLegajo + ", puesto=" + puesto + ", sueldoBasico=" + sueldoBasico + '}';
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola soy un empleado!");
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    

   
    
    
    
}