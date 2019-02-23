package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
       // Objeto Mock
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
        
    }
}