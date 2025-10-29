import java.io.*;

public class main {
    public static void main(String[] args) {

        File archivo = new File("empleados.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println(archivo.getName());
            } else {
                System.out.println("El archivo existe");
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hector Andreo");
            bw.newLine();
            bw.write("Aina de la Rosa");
            bw.newLine();
            bw.write("Oriol Cortes");
            bw.newLine();
            bw.write("Ferran de la paz");
            bw.newLine();
            bw.write("Gerard Losquiño");
            bw.newLine();

            bw.close();
            fw.close();

            System.out.println(archivo.getName() + archivo.getAbsolutePath() +
                    archivo.canRead() + archivo.canWrite());
        } catch (IOException e) {
            System.out.println("Se ha creado mal el archivo");
            e.printStackTrace();
        }
        int contadorLineas = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
                System.out.println("Línea " + contadorLineas + " " + linea);
            }

            System.out.println("Total de líneas leídas: " + contadorLineas);
            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("Se puede leer?: " + archivo.canRead());
            System.out.println("Se puede escribir?: " + archivo.canWrite());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}