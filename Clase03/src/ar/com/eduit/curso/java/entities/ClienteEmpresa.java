package ar.com.eduit.curso.java.entities;
import java.util.ArrayList;
import java.util.List;
public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String dirección;
    private List<Cuenta> cuentas;

    public ClienteEmpresa(int nro, String razonSocial, String dirección) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.dirección = dirección;
        this.cuentas = new ArrayList();
        //this.cuentas.add(new Cuenta(1,"arg$"));
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direcci\u00f3n=" + dirección + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDirección() {
        return dirección;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
    
    
    
    
}