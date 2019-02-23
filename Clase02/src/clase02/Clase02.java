package clase02;

import javax.swing.JOptionPane;

public class Clase02 {
    public static void main(String[] args) {
        
        //Declaración de clase interna
        class Auto{
         
            //En java las clases son Objectos de la clase Class
            //Atributos
            String marca;
            String modelo;
            String color;
            int velocidad;
            
            //Métodos constructores
            //Los constructores son métodos que inicializan un objetos. 
            //En su interior se colocan las acciones necesarias para inicializar un objeto.
            //Los constructores tienen el mismo nombre que la clase, es el unico método inicia en Mayusculas
            //Los constructores pueden recibir parametros y pueden sobrecargarse.
            //Al inicializar un objeto se invoca automaticamente un método constructor.
            //Si la clase no tiene constructor Java en tiempo de compilación agrega un constructor vacio.
            //Los constructores no tienen devolución de datos.
            
            // @Deprecated es una Anotation, existen a partir de JDK5
            // @Deprecated indica que el método es obsoleto y su uso no es recomendado, 
            // el método podria ser eliminado en una siguiente versión del producto.
            
            /**
             * Este método esta deprecado por resultar inseguro, fecha 23/02/2019 por Carlos Ríos
             * Usar en su reemplazo Auto(String marca, String modelo, String color)
             * @deprecated
             */
            @Deprecated
            Auto(){} //Constructor vacio.
            
            Auto(String marca, String modelo, String color){
                this.marca=marca;
                this.modelo=modelo;
                this.color=color;
            }
           
            
            //Métodos
            void acelerar() {                       //acelerar()
                //velocidad+=10; //velocidad=velocidad+10;
                //if(velocidad>100) velocidad=100;
                acelerar(10);
            }
            //Método sobrecargado
            void acelerar(int kms){                 //acelerarInt(int kms)
                velocidad+=kms;
                if(velocidad>100) velocidad=100;
            }
            void frenar()   { velocidad-=10; }  //velocidad=velocidad-10;
            
            void velocidad(){
                System.out.println(velocidad);
            }
            
            int getVelocidad(){ //método con retorno de parametros.
                return velocidad;
            }
            
            @Override
            public String toString(){
                return marca+" "+modelo+" "+color+" "+velocidad;
            }
            
        }// end class Auto
        
        // Creamos Objetos de la clase Auto
        System.out.println("-- auto1 --");
        Auto auto1=new Auto();  //new construye (inicializa) un nuevo Auto
        //Los atributos se inicializan automaticamente.
        //Los atributos numericos se inicializan en 0.
        //Los atributos String se inicializan en null.
        
        auto1.marca="Ford";
        auto1.modelo="Ka";
        auto1.color="Rojo";
        
        auto1.acelerar();           // 10
        auto1.acelerar();           // 20
        auto1.acelerar();           // 30
        auto1.frenar();             // 20
        auto1.acelerar(25);         // 45
        
        System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
        
        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Rojo";
        for(int a=0;a<=60;a++) auto2.acelerar();
        System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
        
        //int x;
        //System.out.println(x);
        //String t;
        //System.out.println(t);
        //Auto a;
        //System.out.println(a);
        //Error no se puede usar una variable no inicilizada
        
        System.out.println("-- auto3 --");
        Auto auto3=new Auto("Renault", "Kangoo", "Rojo");
        
        auto3.acelerar(55);
        
        auto3.velocidad();
        System.out.println(auto3.getVelocidad());
        
        //JOptionPane.showMessageDialog(null, "velocidad: "+auto3.getVelocidad());
        
        //Método toString()
        System.out.println(auto3.toString());
        System.out.println(auto3);
        
        
        //Auto auto4=new Auto();
        
        auto1.velocidad=8000;
        
        System.out.println("-- empleado1 --");
        Empleado empleado1=new Empleado(1, "Laura", "Salas", 600000);
        //empleado1.sueldoBasico=40000000;
        empleado1.setSueldoBasico(800000);
        System.out.println(empleado1);
        
        /*
        Modificadores de visibilidad
        
        Modificador         Alcance
        default (omitido)   Se puede acceder desde la misma clase y clases del mismo paquete.
        public              Se puede acceder desde la misma clase y clases de cualquier paquete.
        private             Solo se puede acceder desde la misma clase.
        protected           Se pude acceder desde la misma clase, desde clases hijas 
                            y desde clases del mismo paquete
        */
        
        
        
        
    }// end main
}// end class Auto
