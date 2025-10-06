import java.io.File;
import java.io.IOException;

public class Actividad1 {
    public static void main(String[] args) {
        File fichero = new File("datos.txt");

        try {
            if (fichero.exists()) {
                System.out.println("El fichero ya existe.");
            } else {
                if (fichero.createNewFile()) {
                    System.out.println("Fichero creado: " + fichero.getName());
                } else {
                    System.out.println("No se pudo crear el fichero.");
                }
            }

            System.out.println("Nombre: " + fichero.getName());
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
            System.out.println("¿Se puede leer? " + fichero.canRead());
            System.out.println("¿Se puede escribir? " + fichero.canWrite());

            if (fichero.delete()) {
                System.out.println("Fichero eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar el fichero.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
