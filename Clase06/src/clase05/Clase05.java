package clase05;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
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
        
        
        //Interfaz Set: brinda una lista sin indices y sin valores duplicados
        Set<String> setString;
        
        //Implementación HashSet: Es la más veloz no garantiza 
        //   el orden de sus elementos.
        setString=new HashSet();
        setString.add("Lunes");
        setString.add("Martes");
        setString.add("Miércoles");
        setString.add("Lunes");
        setString.add("Jueves");
        setString.add("Viernes");
        setString.add("Viernes");
        System.out.println("****************************************");
        setString.forEach(System.out::println);
        
        //Implementacion LinkedHashSet: Almacena los elementos por orden de ingreso
        setString=new LinkedHashSet();
        setString.add("Lunes");
        setString.add("Martes");
        setString.add("Miércoles");
        setString.add("Lunes");
        setString.add("Jueves");
        setString.add("Viernes");
        setString.add("Viernes");
        System.out.println("****************************************");
        setString.forEach(System.out::println);
        
        //Implementación TreeSet: Almacena los elementos en una arbol por orden natural
        setString=new TreeSet();
        setString.add("Lunes");
        setString.add("Martes");
        setString.add("Miércoles");
        setString.add("Lunes");
        setString.add("Jueves");
        setString.add("Viernes");
        setString.add("Viernes");
        System.out.println("****************************************");
        setString.forEach(System.out::println);
        
        Set<Auto>setAutos=new TreeSet();
        //lista2.forEach(setAutos::add);
        setAutos.addAll(lista2);
        setAutos.add(new Auto("Ford","Fiesta","Negro"));
        setAutos.forEach(item->System.out.println(item+"\t"+item.hashCode()));
        
        //Pilas y colas
        // Pila LIFO: Last In First Out
        // Cola FIFO: First In First Out
        
        //Clase Stack   pilas
        Stack<Auto>pilaAutos = new Stack();
        pilaAutos.push(new Auto("VW","Vento","Gris"));
        //.push() apilar un elemento.
        pilaAutos.addAll(lista2);
        System.out.println("*************************************************");
        pilaAutos.forEach(System.out::println);
        System.out.println("Longitud de pila: "+pilaAutos.size());
        while(!pilaAutos.isEmpty()){
            System.out.println(pilaAutos.pop());
            //.pop() desapila un elemento
        }
        System.out.println("Longitud de pila: "+pilaAutos.size());
        
        //Interface Stack Cola
        ArrayDeque<Auto>colaAutos=new ArrayDeque();
        colaAutos.offer(new Auto("Fiat","Idea","Rojo"));
        //.offer() Encolar un elemento.
        colaAutos.addAll(lista2);
        System.out.println("*************************************************");
        colaAutos.forEach(System.out::println);
        System.out.println("Longitud de cola: "+colaAutos.size());
        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll());
            //metodo .poll() descola un elemento
        }
        System.out.println("Longitud de cola: "+colaAutos.size());
        
        //Interface Map: Representa un vector asociativo tipo Llave y Valor
        Map<String,String>mapaSemana;
        
        //Implementación HashMap: es la mas veloz, no garantiza el orden de elementos
        mapaSemana=new HashMap();
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        //System.out.println(mapaSemana.get("vi"));
        System.out.println("*************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k+" "+v));
        
        //Implementacion LinkedHashMap: almacena elementos por orden de ingreso
        mapaSemana=new LinkedHashMap();
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        //System.out.println(mapaSemana.get("vi"));
        System.out.println("*************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k+" "+v));
        
        //Implementación TreeMap:   almancena elementos en un arbol por orden natural
        mapaSemana=new TreeMap();
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        //System.out.println(mapaSemana.get("vi"));
        System.out.println("*************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k+" "+v));
        
        
        //Enumerados        JDK5
        EstadoCivil estado=EstadoCivil.CASADO;
        estado=EstadoCivil.valueOf("SOLTERO");
        Arrays.asList(EstadoCivil.values()).forEach(System.out::println);
        
    }
}