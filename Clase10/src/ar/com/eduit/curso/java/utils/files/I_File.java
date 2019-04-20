package ar.com.eduit.curso.java.utils.files;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
public interface I_File {
    void setText(String text);
    void appendText(String text);
    String getText();
    List<String>getLines();
    LinkedHashSet<String>getLinkedHashSetLines();
    TreeSet<String>getTreeSetLines();
    void appendLine(String line);
    void removeLine(String line);
    void clear();
}