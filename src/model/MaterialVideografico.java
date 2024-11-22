package model;

// Clase que representa un material videográfico, extiende la clase Material
public class MaterialVideografico extends Material {

    private String duracion;

    private String formato;

    // Constructor que inicializa un material videográfico con todos sus atributos
    public MaterialVideografico(String titulo, String autor, String editorial, int anioPublicacion, int cantidadCopias, String duracion, String formato) {
        // Llama al constructor de la clase base Material con la información común
        super("Material Videográfico", titulo, autor, editorial, anioPublicacion, cantidadCopias);
        this.duracion = duracion; 
        this.formato = formato;   
    }

    // Método para obtener la duración del material videográfico
    public String getDuracion() {
        return duracion;  
    }

    // Método para obtener el formato del material videográfico
    public String getFormato() {
        return formato; 
    }
}

