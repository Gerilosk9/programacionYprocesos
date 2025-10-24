package ficherosBinarios;

import java.io.Serializable;

public class persona implements Serializable {
    int id = 0;
    String nom = "";
    int edad = 0;
    String direccio = "";

    public persona(int id, String nom, int edad, String direccio) {
        this.id = id;
        this.nom = nom;
        this.edad = edad;
        this.direccio = direccio;
    }
}

