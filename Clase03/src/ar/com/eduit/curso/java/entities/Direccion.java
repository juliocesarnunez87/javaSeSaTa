package ar.com.eduit.curso.java.entities;
public class Direccion {
    private String calle;
    private int nro;
    private int piso;
    private String depto;
    private int cp;

    public Direccion(String calle, int nro, int piso, String depto, int cp) {
        this.calle = calle;
        this.nro = nro;
        this.piso = piso;
        this.depto = depto;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", nro=" + nro + ", piso=" + piso + ", depto=" + depto + ", cp=" + cp + '}';
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
    
    
    
}