package controller;

import model.Libro;
import java.util.ArrayList;

// Controlador que maneja las operaciones relacionadas con los libros
public class LibroController {
    
    // Lista que almacena los libros
    private ArrayList<Libro> libros = new ArrayList<>();

    // Método para agregar un libro a la lista
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para eliminar un libro de la lista por su título
    public void eliminarLibro(String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para listar todos los libros en la biblioteca
    public ArrayList<Libro> listarLibros() {
        return libros; 
    }

    // Método para actualizar la cantidad de copias de un libro
    public void actualizarCantidad(String titulo, int nuevaCantidad) {
        // Itera sobre los libros y actualiza la cantidad del libro cuyo título coincide
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.setCantidadCopias(nuevaCantidad);
                break;
            }
        }
    }
}
