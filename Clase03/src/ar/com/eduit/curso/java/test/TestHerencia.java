package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.Cliente;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Direccion;
import ar.com.eduit.curso.java.entities.Empleado;
import ar.com.eduit.curso.java.entities.Persona;

public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("-- dir1 --");
        Direccion dir1=new Direccion("Lavalle", 648, 6, "a", 1065);
        System.out.println(dir1);
        
        System.out.println("-- dir2 --");
        Direccion dir2=new Direccion("Peru",650, 1, "a", 1068);
        System.out.println(dir2);
        
        /*
        System.out.println("-- persona1 --");
        Persona persona1=new Persona("Juan", "Melis", 50, dir2);
        persona1.saludar();
        System.out.println(persona1);
        
        System.out.println("-- persona2 --");
        Persona persona2=new Persona("Florencia","Torres",45,
                new Direccion("Viel", 234, 2, "b", 1010));
        persona2.saludar();
        System.out.println(persona2);
        
        System.out.println("-- persona3 --");
        Persona persona3=new Persona("Yolanda","Rojas",52,persona2.getDireccion());
        persona3.saludar();
        System.out.println(persona3);
        */
        
        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Encargado", 50000, "Julia", "Rodriguez", 
                50, dir2);
        empleado1.saludar();
        System.out.println(empleado1);
        
        System.out.println("-- cliente1 --");
        Cliente cliente1=new Cliente(1, new Cuenta(10,"arg$"), 
                "Javier", "Larrosa", 60, dir2);
        cliente1.saludar();
        System.out.println(cliente1);
        
        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1, "arg$");
        cuenta1.depositar(20000);
        cuenta1.depositar(90000);
        cuenta1.debitar(15000);
        System.out.println(cuenta1);
        
        System.out.println("-- cuenta2 --");
        Cuenta cuenta2=new Cuenta(2, "arg$");
        cuenta2.depositar(40000);
        System.out.println(cuenta2);
        
        // Polimorfismo
        
        Persona p1=new Empleado(10, "DBA", 140000, "Ana", "Rivas", 40, dir2);
        Persona p2=new Cliente(10, cuenta1, "Maria", "Gomez", 50, dir1);
        
        
        p1.saludar();
        p2.saludar();
        
        //Operador de casteo ()
        Cliente c1=(Cliente)p2;
        c1.getCuenta().depositar(20000);
        
        
        //Operador instanceof
        Cliente c2=(p2 instanceof Cliente)?(Cliente)p2:null;
        System.out.println(c2);
        
        
        //método getClass()
        System.out.println(p1.getClass());
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSimpleName());
        System.out.println(p1.getClass().getSuperclass().getName());
        System.out.println(
                p1
                        .getClass()
                        .getSuperclass()
                        .getSuperclass()
                        .getName()
        );
        System.out.println(
                p1
                .getClass()
                .getSuperclass()
                .getSuperclass()
                .getSuperclass()
        );
        
        
        
        
        
    }
}