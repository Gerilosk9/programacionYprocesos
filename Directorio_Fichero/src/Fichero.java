import java.io.File;

public class Fichero {
    public static void main(String[] args) {
        try {
            
            File fichero = new File("C:\\prueba\\miFichero.txt");

            if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado el fichero");

        } catch (Exception ioe) {
            System.err.println("Error: " + ioe.getMessage());
        }
    }
}
