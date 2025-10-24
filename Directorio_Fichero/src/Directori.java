import java.io.File;

    public class Directori {
        public static void main(String[] args) {
            try {

                String directorio = "C:\\prueba";
                String varios = "carpeta1/carpeta2/carpeta3";

                boolean exito = (new File(directorio)).mkdir();
                if (exito)
                    System.out.println("Directorio: " + directorio + " creado");

                exito = (new File(varios)).mkdirs();
                if (exito)
                    System.out.println("Directorios: " + varios + " creados");

            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }


