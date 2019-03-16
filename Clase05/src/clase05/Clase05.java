package clase05;
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
               return true;
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
        
        
    }
}