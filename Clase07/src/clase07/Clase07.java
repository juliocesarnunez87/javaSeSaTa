package clase07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase07 {
    public static void main(String[] args)  {
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
        
        /*
        try{
                System.out.println(10/1);
                System.out.println("Esta linea no se ejecuta.");
            }catch(Exception e){
                System.out.println("Ocurrio un error!");
                System.out.println(e);
            }finally{
                System.out.println("El programa termina normalmente.");
            }
         */
        
        /*
        try {
            //GeneradorExcepciones.generar();
            //GeneradorExcepciones.generar(true);
            //GeneradorExcepciones.generar("22 ");
            //GeneradorExcepciones.generar(null, 10);
            GeneradorExcepciones.generar("hola", 10);
            System.out.println("Esta linea no se ejecuta.");
        } catch (Exception e) {
            System.out.println(e);
        }
        */
            
            
        
        try {
            //GeneradorExcepciones.generar();
            //GeneradorExcepciones.generar(true);
            //GeneradorExcepciones.generar("22x");
            //GeneradorExcepciones.generar(null, 10);
            GeneradorExcepciones.generar("hola", 10);
            FileReader in=new FileReader(new File("texto.txt"));
        }catch (IndexOutOfBoundsException e){ System.out.println("Indice fuera de rango!");
        //}catch(ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e){ 
        //    System.out.println("Fuera de rango");
        //}catch (ArrayIndexOutOfBoundsException e) { System.out.println("Indice fuera de rango"); 
        }catch (ArithmeticException e) { System.out.println("Error División /0");
        }catch (NumberFormatException e) { System.out.println("Formato de Número Incorrecto"); 
        }catch (NullPointerException e) { System.out.println("Puntero Nulo");
        //}catch (StringIndexOutOfBoundsException e) { System.out.println("Indice fuera de rango");
        }catch (FileNotFoundException e) { System.out.println("No se encontro el archivo.");
        }catch (IOException e) { System.out.println("Error E/S");
        }catch (Exception e) { System.out.println("Ocurrio un error no esperado!"); }
             
        
        //Uso de Exceptions para Reglas de Negocio
        Vuelo vuelo1=new Vuelo("aer1234",100);
        Vuelo vuelo2=new Vuelo("lat1111",100);
        
        try {
            vuelo1.venderPasajes(20);
            vuelo2.venderPasajes(10);
            vuelo1.venderPasajes(50);
            vuelo2.venderPasajes(20);
            vuelo1.venderPasajes(40);       //Esta venta lanza Exception
            vuelo2.venderPasajes(20);       //Esta venta no se realiza
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }
        
        // try with resources       JDK 7
        try (FileWriter out=new FileWriter(new File("texto.txt"))) {
            out.write("hola");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
            
    }
    
}
