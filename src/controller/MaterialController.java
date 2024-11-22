package controller;

import java.util.ArrayList;

public abstract class MaterialController<T> {

    // Lista que almacena los materiales
    protected ArrayList<T> materiales = new ArrayList<>();

    // Método para agregar un material
    public void agregarMaterial(T material) {
        materiales.add(material);
    }

    // Método para eliminar un material de la lista por su título
    public void eliminarMaterial(String titulo) {
        materiales.removeIf(material -> obtenerTitulo(material).equalsIgnoreCase(titulo));
    }

    // Método para listar todos los materiales
    public ArrayList<T> listarMateriales() {
        return materiales; 
    }

    // Método para actualizar la cantidad de copias de un material
    public void actualizarCantidad(String titulo, int nuevaCantidad) {
        for (T material : materiales) {
            if (obtenerTitulo(material).equalsIgnoreCase(titulo)) {
                actualizarCantidadMaterial(material, nuevaCantidad);
                break;
            }
        }
    }

    // Método abstracto para obtener el título del material
    protected abstract String obtenerTitulo(T material);

    // Método abstracto para actualizar la cantidad de copias de un material
    protected abstract void actualizarCantidadMaterial(T material, int nuevaCantidad);
}
