package ar.com.eduit.curso.java.utils.validator;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Validator {
    private JTextField txt;
    private JLabel lbl;
    public Validator(JTextField txt,JLabel lbl) { 
        this.txt = txt; 
        this.lbl = lbl;
    }
    private boolean retorno(String msj){
        lbl.setText(msj);
        txt.requestFocus();
        txt.selectAll();
        return false;
    }
    public boolean length(int length){
        if(txt.getText().length()==length) return true;
        return retorno("Debe tener "+length+" caracteres.");
    }
    public boolean length(int min, int max){
        if(txt.getText().length()>=min && txt.getText().length()<=max) return true;
        return retorno("Debe tener entre "+min+" y "+max+" caracteres.");
    }
    public boolean isInteger(){
        try {
            Integer.parseInt(txt.getText());
            return true;
        } catch (Exception e) {
            return retorno("Debe ser un número entero");
        }
    }
    public boolean isInteger(int min,int max){
        if(!isInteger()) return false;
        int nro=Integer.parseInt(txt.getText());
        if(nro>=min && nro<=max) return true;
        return retorno("Debe ser un entero entre "+min+" y "+max);
    }
}