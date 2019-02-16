package clase01;

import javax.swing.JOptionPane;

/**
 * Clase principal del proyecto Clase01 del curso de Java
 *
 * @author Carlos Ríos
 */
public class Clase01 {

    /**
     * Punto de entrada del proyecto.
     *
     * @param args Argumentos que ingresan desde consola.
     */
    public static void main(String[] args) {
        /*
        Curso: Java Standard Programming 8.X    40 hs.
        Días: Sábado 15:00 a 19:00 hs.
        Profe: Carlos P. Ríos   carlos.rios@educacionit.com
        
        Materiales: alumni.educacionit.com
        
        Software:   JDK 8.X y netbeans IDE 8.2
                    JDK 11  y netbeans IDE 10
        
        JDK:    Java Development Kit    (Kit de desarrollo Java)
        
        JDK Alternativo: OpenJDK
        
        LTS Long Term Support 8 años
        
        Versión     Fecha de Liberación         Fin de Soporte
        JDK 8 LTS   Septiembre 2014             Septiembre 2020
        JDK 9       Septiembre 2017             Marzo 2018
        JDK 10      Marzo 2018                  Septiembre 2018
        JDK 11 LTS  Septiembre 2018             Septiembre 2026
        JDK 12      Marzo 2019                  Septiembre 2019
        JDK 13      Septiembre 2019             Marzo 2020
        JDK 14 LTS  Marzo 2020                  Marzo 2028
        
        IDE Integrated Development Enviroment (Entorno de Desarrollo Integrado)
        
        IDEs Alternativos:  Eclipse, IntelliJ, JDeveloper.
        
         */

 /* Bloque de comentarios */
        // Comentario de 1 linea
        /**
         * Comentario JavaDOC Los comentarios JavaDoc deben ubicarse delante de
         * la declaración de Método o de Clases.
         */
        // sout TAB atajo para System.out.println("");
        System.out.println("Hola Mundo!!");

        //F6 para Ejecutar.
        //JOptionPane.showMessageDialog(null, "Hola a todos");
        //Tipo de datos primitivos
        //Tipo de datos boolean         1 Byte
        boolean bo = true;
        System.out.println(bo);
        bo = false;
        System.out.println(bo);

        //Tipo de datos Byte            1 Byte      -128 0 127
        byte by = -50;
        System.out.println(by);
        by = 100;
        System.out.println(by);

        byte by2;
        //System.out.println(by2); //Error no se puede usar una variable no inicializada

        //Tipo de datos short           2 bytes
        short sh = -2000;
        sh = 2000;
        System.out.println(sh);

        //Tipo de datos int             4 bytes
        int in = -2000000000;
        System.out.println(in);

        //Tipo de datos long            8 bytes
        long lo = 3000000000L;
        System.out.println(lo);

        //Tipo de datos char            2 bytes unsigned (unicode)
        char ch = 65;
        System.out.println(ch);
        ch += 32;         //ch=ch+32;
        System.out.println(ch);

        //Tipo de datos float           32 bits
        float fl = 9.25f;
        System.out.println(fl);

        //Tipo de datos double          64 bits
        double dl = 9.25;
        System.out.println(dl);

        fl = 1;
        dl = 1;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 10;
        dl = 10;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 100;
        dl = 100;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = -100;
        dl = -100;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        //Clase String
        String st = "Esto es una cadena de caracteres.";
        System.out.println(st);

        //Hasta java 9 String almacena en un vector de caracteres 
        //A partir de java 10 String almacena un vector de bytes.
        //Tipo de var jdk9
        /*
        var var1=100;           //int
        //var1=33.5;            //Error la variable var1 es int
        var var2=33.5;          //double
        var var3=33.5f;         //float
        var var4="x"            //String
        var var5='x'            //char
        var var6=true           //boolean
        var var7=2400L          //long
        
         */
        System.out.println(st);

        //Recorrer el vector st e imprimir sus caracteres
        for (int a = 0; a < st.length(); a++) {
            System.out.print(st.charAt(a));
        }
        System.out.println();
        
        //Imprimir st en Mayusculas
        for(int a=0;a<st.length();a++){
            char car=st.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.println();
        
        //Operador Ternario ?
        for(int a=0;a<st.length();a++){
            char car=st.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car);
        }
        System.out.println();
        
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        
        //https://github.com/crios2020/javaSeSaTa
        
    }
}
