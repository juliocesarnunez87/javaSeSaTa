package clase07;
public class GeneradorExcepciones {
    public static void generar(){
        int[] vector=new int[5];
        vector[10]=20;
    }
    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }
    public static void generar(String nro){
        int numero=Integer.parseInt(nro);
    }
    public static void generar(String texto,int pos){
        //if(texto== null || pos<0 || pos>=texto.length()) return;
        System.out.println(texto.charAt(pos));
    }
}