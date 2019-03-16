package clase05;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Clase05 {
    public static void main(String[] args) {
        // Clase 05
        class X{
            int dato;
            public X(int dato) {
                this.dato = dato;
            }  

            @Override
            public String toString() {
                return "X{" + "dato=" + dato + '}';
            }

            @Override
            public int hashCode() {
                return toString().hashCode();
            }

            @Override
            public boolean equals(Object obj) {
               if(obj.getClass()!=this.getClass()) return false;
               return this.toString().equals(obj.toString());
            }
            
        }// end class X
        class Y extends X{
            Y(int dato){
                super(dato);
            }

        }// end class Y
        
        Y o1=new Y(2);
        Y o2=o1;
        Y o3=new Y(2);
        Y o4=new Y(3);
        String o5="2";
        
        System.out.println(o1.getClass().getName());
        System.out.println(o1.getClass().getSimpleName());
        System.out.println(o1.getClass().getSuperclass().getName());
        System.out.println(o1.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(
                o1
                        .getClass()
                        .getSuperclass()
                        .getSuperclass()
                        .getSuperclass()
        );
        
        //método hashCode();
        System.out.println("o1.hashCode()="+o1.hashCode());
        System.out.println("o2.hashCode()="+o2.hashCode());
        System.out.println("o3.hashCode()="+o3.hashCode());
        System.out.println("o4.hashCode()="+o4.hashCode());
        System.out.println("o5.hashCode()="+o5.hashCode());
        
        //método equals()
        System.out.println("o1.equals(o1)="+o1.equals(o1));     // true
        System.out.println("o1.equals(o2)="+o1.equals(o2));     // true
        System.out.println("o1.equals(o3)="+o1.equals(o3));     // false
        System.out.println("o1.equals(o4)="+o1.equals(o4));     // false
        System.out.println("o1.equals(o5)="+o1.equals(o5));     // false
        
        //Clase String
        String texto="Esto es una cadena de caracteres!";
        String texto2=new String("Hola");
        char[] vector={'h','o','l','a'};
        String texto3=new String(vector);
        
        //.length()
        System.out.println(texto.length());
        
        //.chatAt()
        System.out.println(texto.charAt(5));
        
        //.subString()
        System.out.println(texto.substring(10));
        System.out.println(texto.substring(10, 15));
        
        //.equals() .equalsIgnoreCase()
        System.out.println(texto2.equals("HOLA"));
        System.out.println(texto2.equalsIgnoreCase("HOLA"));
        
        //.startsWith() .endsWith()
        System.out.println(texto.startsWith("Hola"));
        System.out.println(texto.startsWith("Esto"));
        System.out.println(texto.endsWith("chau"));
        System.out.println(texto.endsWith("res!"));
        
        //.toUpperCase() .toLowerCase()
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        
        // .split()
        String[] palabras=texto.split(" ");
        for(int a=0;a<palabras.length;a++){
            System.out.println(palabras[a]);
        }
        
        System.out.println(System.getProperties());
        System.out.println(System.getenv());
        
        String[] propiedades=System.getProperties().toString().split(",");
        String[] propiedades2=System.getenv().toString().split(",");
        for(int a=0;a<propiedades.length;a++) System.out.println(propiedades[a]);
        for(int a=0;a<propiedades2.length;a++) System.out.println(propiedades2[a]);
        
        String st="";
        System.out.println(st+"\t"+st.hashCode());
        st+="h";
        System.out.println(st+"\t"+st.hashCode());
        st+="o";
        System.out.println(st+"\t"+st.hashCode());
        st+="l";
        System.out.println(st+"\t"+st.hashCode());
        st+="a";
        System.out.println(st+"\t"+st.hashCode());
        
        //Clase StringBuilder StringBuffer
        //StringBuffer sb=new StringBuffer();
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString()+"\t"+sb.hashCode());
        
        // Vectores
        Auto autos[]=new Auto[4];
        autos[0]=new Auto("Fiat","Idea","Rojo");
        autos[1]=new Auto("Ford","Ka","Verde");
        autos[2]=new Auto("Peugeot","208","Gris");
        autos[3]=new Auto("Renault","Kangoo","Bordo");
        
        // Recorrido por indices
        // for(int a=0;a<autos.length;a++) System.out.println(autos[a]);
        
        // Recorrido forEach
        for(Auto auto:autos) System.out.println(auto);
        
        Archivo archivo;
        
        //archivo=new ArchivoTexto();
        archivo=new ArchivoBinario();
        
        archivo.setText("texto");
        System.out.println(archivo.getText());
        archivo.info();
        
        
        //Interface List: Representa una lista con indices.
        List lista=new ArrayList();
        lista.add(new Auto("WV","Gol","Blanco"));
        lista.add(new Auto("Citroen","C4","Negro"));
        lista.add("Hola");
        lista.add(23);
        
        //Recorrido con indices
        //for(int a=0;a<lista.size();a++) System.out.println(lista.get(a));
        
        //Recorrido foreach
        //for(Object o:lista) System.out.println(o);
        
        //Copiar los autos del vector auto a la lista
        for(Auto a:autos) lista.add(a);
            
        lista.remove(3);
        
        //.metodo foreach java8
        //Expresiones Lamda
        //lista.forEach(item->System.out.println(item));
        //lista.forEach(item->{
        //    System.out.println(item);
        //});
        lista.forEach(System.out::println);
        
        //Uso de Generics       a partir de JDK5
        List<Auto>lista2=new ArrayList();
        lista2.add(new Auto("Ford","Fiesta","Negro"));
        
        Auto auto1=(Auto)lista.get(0);
        Auto auto2=lista2.get(0);
        
        //Copiar autos de lista a lista2
        lista.forEach(item->{
            if(item instanceof Auto) lista2.add((Auto)item);
        });
        System.out.println("*************************************************");
        lista2.forEach(System.out::println);
        System.out.println("*************************************************");
        // Mostrar autos marca ford 
        lista2
                .stream()
                .filter(a->a.getMarca().equalsIgnoreCase("Ford"))
                .forEach(System.out::println);
        
    }
}