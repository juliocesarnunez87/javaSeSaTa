package clase05;
public class ArchivoBinario implements Archivo{
    @Override
    public void setText(String text) {
        System.out.println("Escribiendo Archivo Binario.");
    }
    @Override
    public String getText() {
        return "Texto Archivo Binario";
    }
}