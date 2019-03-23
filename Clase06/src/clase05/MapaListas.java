package clase05;
import java.util.LinkedHashMap;
import java.util.Map;
public class MapaListas {
    public static Map<String,String> getMapa(){
        Map<String,String>mapa=new LinkedHashMap();
        mapa.put("Lista_Con_Duplicados", "java.util.ArrayList");
        mapa.put("Lista_Sin_Duplicados", "java.util.LinkedHashSet");
        mapa.put("Lista_Ordenada", "java.util.TreeSet");
        mapa.put("Lista_Vector", "java.util.Vector");
        mapa.put("Lista_Enlazada", "java.util.LinkedList");
        mapa.put("Cola", "java.util.ArrayDeque");
        mapa.put("Pila", "java.util.Stack");
        mapa.put("Lista_Desordenada", "java.util.HashSet");
        return mapa;
    }
}