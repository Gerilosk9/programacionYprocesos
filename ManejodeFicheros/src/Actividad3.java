import java.io.*;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        File fichero = new File("numeros.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))) {
            for (int i = 1; i <= 100; i++) {
                writer.write(String.valueOf(i));
                writer.newLine();
            }
            System.out.println("Fichero creado con números del 1 al 100.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nMúltiplos de 10:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            int numero;
            while ((linea = reader.readLine()) != null) {
                numero = Integer.parseInt(linea);
                if (numero % 10 == 0) {
                    System.out.println(numero);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (RandomAccessFile raf = new RandomAccessFile(fichero, "r");
             Scanner sc = new Scanner(System.in)) {

            System.out.print("\nIntroduce el número de línea que deseas leer (1-100): ");
            int lineaBuscada = sc.nextInt();

            raf.seek(0);
            for (int i = 1; i <= lineaBuscada; i++) {
                String linea = raf.readLine();
                if (i == lineaBuscada) {
                    System.out.println("Línea " + lineaBuscada + ": " + linea);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
