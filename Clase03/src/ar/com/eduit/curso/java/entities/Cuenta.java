package ar.com.eduit.curso.java.entities;
public class Cuenta {
    int nro;
    String moneda;
    float saldo;

    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
        this.saldo = 0;
    }
    
    public final void depositar(float monto){ saldo+=monto; }
    //Modificador final no permite sobreescribir en clases hijas
    
    public final void debitar(float monto){
        if(saldo>=monto) saldo-=monto;
        else System.out.println("Saldo Insuficiente.");
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }
    
    
}