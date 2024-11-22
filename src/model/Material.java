package model;

// Clase abstracta que representa un material
public abstract class Material {
    // Atributos comunes a todos los tipos de material
    private String tipoMaterial; 
    private String titulo;     
    private String autor;      
    private String editorial;   
    private int anioPublicacion;
    private int cantidadCopias; 

    // Constructor que inicializa los atributos de un material
    public Material(String tipoMaterial, String titulo, String autor, String editorial, int anioPublicacion, int cantidadCopias) {
        this.tipoMaterial = tipoMaterial;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cantidadCopias = cantidadCopias;
    }

    // Métodos getters para obtener los valores de los atributos

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    // Método setter para actualizar la cantidad de copias de un material
    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }
}
