package model;

// Clase que representa un libro, que extiende de la clase abstracta Material
public class Libro extends Material {
    
    // Constructor de la clase Libro que llama al constructor de la clase Material
    public Libro(String titulo, String autor, String editorial, int anioPublicacion, int cantidadCopias) {
        super("Libro", titulo, autor, editorial, anioPublicacion, cantidadCopias);
    }
}
