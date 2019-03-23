package clase05;
public interface Archivo {
    /*
    Interfaces:
    - Todos los miembros de una interface son publicos.
    - Una interface no tiene constructor ni atributos.
    - Una interface solo tiene métodos y constantes.
    - Los métodos de una interface son todos abstractos.
        (No tienen código)
        (Las clases que implementan la interface ponen el código)
    - Una clase puede implementar muchas interfaces.
    */
    void setText(String text);
    String getText();
    
    /*
    Métodos default: Los métodos default estan desde jdk8. Son métodos 
    que pueden tener código y es heredado a las clases que implementan
    la interface.
    */
    default void info(){
        System.out.println("Método default.");
    }
}