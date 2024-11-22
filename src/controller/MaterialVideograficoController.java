package controller;

import model.MaterialVideografico;
import java.util.ArrayList;

// Controlador que maneja las operaciones relacionadas con el material videográfico
public class MaterialVideograficoController {

    // Lista que almacena los materiales videográficos
    private ArrayList<MaterialVideografico> materiales = new ArrayList<>();

    // Método para agregar un material videográfico a la lista
    public void agregarMaterial(MaterialVideografico material) {
        materiales.add(material);
    }

    // Método para eliminar un material videográfico de la lista por su título
    public void eliminarMaterial(String titulo) {
        
        materiales.removeIf(material -> material.getTitulo().equalsIgnoreCase(titulo));
    }

    // Método para listar todos los materiales videográficos en la biblioteca
    public ArrayList<MaterialVideografico> listarMateriales() {
        return materiales; 
    }

    // Método para actualizar la cantidad de copias de un material videográfico
    public void actualizarCantidad(String titulo, int nuevaCantidad) {
        // Itera sobre los materiales y actualiza la cantidad del material cuyo título coincide
        for (MaterialVideografico material : materiales) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                material.setCantidadCopias(nuevaCantidad);
                break;  
            }
        }
    }
}
