package clase07;
public class Clase07 {
    public static void main(String[] args) {
        //System.out.println(10/0);
        //System.out.println("Esta linea no se ejecuta.");
        
        
        /*
            Estructura try catch finally
        
            try{
                //colocar todas las sentencias que pueden arrojar Exception.
                //estas sentencias tienen más costo de hardware.
            }catch(Exception e){
                //estas sentencias se ejecutan en caso de exception
                //se recibe como parametro un objeto de Exception
                //Los objetos creados en el bloque try estan destruidos al llegar a esta parte
            }finally{
                //estas sentencias se van a ejecutar siempre ocurra Exception o no
                //este bloque es opcional.
                //los objetos creados en try y en cacth estan destruidos
            }
        */
            try{
                System.out.println(10/1);
                System.out.println("Esta linea no se ejecuta.");
            }catch(Exception e){
                System.out.println("Ocurrio un error!");
                System.out.println(e);
            }finally{
                System.out.println("El programa termina normalmente.");
            }
    }
}