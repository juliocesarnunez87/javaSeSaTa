package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.ClienteEmpresa;
import ar.com.eduit.curso.java.entities.ClientePersona;
import ar.com.eduit.curso.java.entities.Cuenta;
import java.util.List;

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
        
        System.out.println("-- clientePersona1 --");
        ClientePersona cp1=new ClientePersona(1, "Laura", "Vilas", 3);
        
        cp1.getCuenta().depositar(50000);
        
        Cuenta cuentaCliente1=cp1.getCuenta();
        cuentaCliente1.depositar(20000);
        cuentaCliente1.debitar(5000);
        
        System.out.println(cp1);
        System.out.println(cp1.getCuenta());
        
        
        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa ce1=new ClienteEmpresa(1, "Todo Limpio srl", "Lavalle 648");
        ce1.getCuentas().add(cuenta1);
        ce1.getCuentas().add(cuenta2);
        ce1.getCuentas().add(new Cuenta(4,"U$S"));
        
        List<Cuenta> cuentas=ce1.getCuentas();
        cuentas.get(0).depositar(20000);
        cuentas.get(1).depositar(40000);
        cuentas.get(2).depositar(10000);
        
        System.out.println(ce1);
        for(int a=0;a<cuentas.size();a++) System.out.println(cuentas.get(a));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}