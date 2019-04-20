package ar.com.eduit.curso.java.utils.files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
public class FileText implements I_File {
    private File file;
    public FileText(File file) {
        this.file = file;
    }
    public FileText(String file) {
        this.file = new File(file);
    }

    @Override
    public void setText(String text) {
        try (FileWriter out=new FileWriter(file)){
            out.write(text);
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void appendText(String text) {
        try (FileWriter out=new FileWriter(file,true)){
            out.write(text);
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public String getText() {
        StringBuilder sb=new StringBuilder();
        int car;
        try (FileReader in=new FileReader(file)){
            while((car=in.read())!=-1){
                sb.append((char)car);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return sb.toString();
    }

    @Override
    public List<String> getLines() {
        List<String>lista=new ArrayList();
        try (BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file)
                )
        )) {
            in.lines().forEach(lista::add);
        } catch (Exception e) { e.printStackTrace(); }
        return lista;
    }

    @Override
    public LinkedHashSet<String> getLinkedHashSetLines() {
       LinkedHashSet<String> set=new LinkedHashSet();
       set.addAll(getLines());
       return set;
    }

    @Override
    public TreeSet<String> getTreeSetLines() {
        TreeSet<String> set=new TreeSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public void appendLine(String line) {
        appendText(line+"\n");
    }

    @Override
    public void removeLine(String line) {
        List<String>lineas=getLines();
        lineas.remove(line);
        clear();
        lineas.forEach(this::appendLine);
    }

    @Override
    public void clear() {
        setText("");
    }
}