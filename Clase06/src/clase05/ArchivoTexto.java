package clase05;
public class ArchivoTexto implements Archivo{
    @Override
    public void setText(String text){
        System.out.println("Escribiendo Archivo Caracter");
    }
    @Override
    public String getText(){
        return "Texto de Archivo Caracter";
    }
}
