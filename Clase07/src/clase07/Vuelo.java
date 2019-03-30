package clase07;
public class Vuelo {
    private String nombre;
    private int cantidad;
    public Vuelo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "Vuelo{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException {
        if(this.cantidad<cantidad) throw new NoHayMasPasajesException(nombre,cantidad);
        this.cantidad-=cantidad;
    }
     
}