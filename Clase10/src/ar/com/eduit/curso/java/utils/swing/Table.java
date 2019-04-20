package ar.com.eduit.curso.java.utils.swing;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Table <E> {
    public void cargar(JTable tbl,List<E> lista){
        if(tbl==null) return;
        tbl.setModel(new DefaultTableModel());
        if(lista==null ||lista.isEmpty()) return;
        E e=lista.get(0);
        Field[] campos=e.getClass().getDeclaredFields();
        DefaultTableModel dtm=new DefaultTableModel();
        for(Field f:campos) dtm.addColumn(f.getName());
        for(E o:lista){
            Object[] fila=new Object[campos.length];
            e=o;
            for(int a=0;a<campos.length;a++){
                try {
                    String method="get"
                            +campos[a].getName().substring(0,1).toUpperCase()
                            +campos[a].getName().substring(1);
                    //System.out.println(method);
                    fila[a]=e.getClass().getMethod(method).invoke(o);
                } catch (Exception ex) { ex.printStackTrace(); }
            }
            dtm.addRow(fila);
        }
        tbl.setModel(dtm);
    }
}