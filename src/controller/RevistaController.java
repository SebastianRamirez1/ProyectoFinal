package controller;

import model.Revista;
import java.util.ArrayList;

// Controlador que maneja las operaciones relacionadas con las revistas
public class RevistaController {

    // Lista que almacena las revistas
    private ArrayList<Revista> revistas = new ArrayList<>();

    // Método para agregar una nueva revista a la lista
    public void agregarRevista(Revista revista) {
        revistas.add(revista); 
    }

    // Método para eliminar una revista de la lista por su título
    public void eliminarRevista(String titulo) {
      
        revistas.removeIf(revista -> revista.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para listar todas las revistas en la biblioteca
    public ArrayList<Revista> listarRevistas() {
        return revistas;  
    }

    // Método para actualizar la cantidad de copias de una revista
    public void actualizarCantidad(String titulo, int nuevaCantidad) {
        // Itera sobre las revistas y actualiza la cantidad de la revista cuyo título coincide
        for (Revista revista : revistas) {
            if (revista.getTitulo().equalsIgnoreCase(titulo)) {
                revista.setCantidadCopias(nuevaCantidad);
                break; 
            }
        }
    }
}
