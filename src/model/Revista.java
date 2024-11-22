package model;

// Clase que representa una revista, extiende la clase Material
public class Revista extends Material {

    private String tipoRevista;

    // Constructor que inicializa una revista con todos sus atributos
    public Revista(String titulo, String autor, String editorial, int anioPublicacion, int cantidadCopias, String tipoRevista) {
        // Llama al constructor de la clase base Material con la información común
        super("Revista", titulo, autor, editorial, anioPublicacion, cantidadCopias);
        this.tipoRevista = tipoRevista; 
    }

    // Método para obtener el tipo de revista
    public String getTipoRevista() {
        return tipoRevista; 
    }
}
