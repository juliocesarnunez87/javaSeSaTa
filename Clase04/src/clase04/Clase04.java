package clase04;

import java.util.Scanner;

public class Clase04 {
    public static void main(String[] args) {
        // Clase04 Interfaz Gráfica
        
        /*
        AWT:    Abstract Windows Type
                - Primer Interfaz Gráfica.
                - Inscrustada en el core Java.
                - Mejor Performance.
        
                - No se ve igual en los distintos SOs
        
        Swing:  Es una mejora de AWT, garantiza el mismo aspecto a todos los SOs
        
        FX:
                - A partir de JDK 5
                - Cumple con el patron MVC
                - Permite hacer aplicaciones WEB y Mobile
                - Fue un fracaso en lo comercial
                - En JDK 11 fue removido.
        
        */
        
        //Clases System
        
        //Metodo .exit(); Cierra el runtime
        //System.exit(0);
        //System.out.println("Esta linea no se ejecuta.");
        
        //propiedades getProperties()
        //System.out.println(System.getProperties());
        //System.out.println(System.getProperty("os.name"));
        
        //atributos out err in
        //out: provee un stream sincronizado a la consola de salida.
        //err: provee un stream no sincronizado a la consola de salida.
        //in: provee un stream de entrada de consola de usuario
        
        System.out.println("Ingrese su nombre:");
        String nombre=new Scanner(System.in).next();
        System.out.println("Hola "+nombre);
        
        System.out.println("Hola 1");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
        System.out.println("Hola 4");
        System.out.println("Hola 5");
        System.out.println("Hola 6");
        System.out.println("Hola 7");
        System.out.println("Hola 8");
        System.out.println("Hola 9");
        System.out.println("Hola 10");
        System.out.println("Hola 11");
        System.out.println("Hola 12");
        System.err.println("Ocurrio un error!");
        
        
        
        
        
    }
    
}
