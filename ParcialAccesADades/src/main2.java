import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class main2 {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1, "El Quijote", "Miguel de Cervantes", "15.99€");
        Libro libro2 = new Libro(2, "1984", "George Orwell", "12.50€");
        Libro libro3 = new Libro(3, "La sombra del viento", "Carlos Ruiz Zafón", "18.20€");

        File carpeta = new File("ficheros");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        File fichero = new File(carpeta, "libros.dat");

    }
}
