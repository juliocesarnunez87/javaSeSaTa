package clase07;
import ar.com.eduit.curso.java.utils.FileText;
import ar.com.eduit.curso.java.utils.I_File;
public class Test {
    public static void main(String[] args) {
        String file="texto.txt";
        I_File fileText=new FileText(file);
        fileText.setText("Curso de Java.\n");
        fileText.appendText("Primavera.\n");
        fileText.appendText("Verano.\n");
        fileText.appendText("Otoño.\n");
        fileText.appendText("Invierno.\n");
        fileText.appendText("Otoño.\n");
        fileText.appendText("Invierno.\n");
        
        //fileText.clear();
        
        fileText.appendLine("Lunes.");
        fileText.appendLine("Martes.");
        fileText.appendLine("Miércoles.");
        fileText.appendLine("Jueves.");
        fileText.appendLine("Viernes.");
        fileText.appendLine("Sábado.");
        fileText.appendLine("Domingo.");
        
        fileText.removeLine("Lunes.");
        
        //System.out.println(fileText.getText());
        fileText.getLines().forEach(System.out::println);
        
        //fileText.getLinkedHashSetLines().forEach(System.out::println);
        
        //fileText.getTreeSetLines().forEach(System.out::println);
        
        
    }
}