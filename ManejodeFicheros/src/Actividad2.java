import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Actividad2 {
    public static void main(String[] args) {
        File fichero = new File("alumnos.txt");
        List<String> alumnos = List.of("Ana", "Luis", "Carlos", "María", "Elena");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))) {
            for (String alumno : alumnos) {
                writer.write(alumno);
                writer.newLine();
            }
            System.out.println("Fichero escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        int lineas = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                lineas++;
            }
            System.out.println("Número total de líneas leídas: " + lineas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
