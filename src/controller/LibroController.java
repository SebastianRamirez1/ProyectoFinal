package controller;

import model.Libro;

public class LibroController extends MaterialController<Libro> {

    // Implementación del método abstracto para obtener el título del libro
    @Override
    protected String obtenerTitulo(Libro libro) {
        return libro.getTitulo();
    }

    // Implementación del método abstracto para actualizar la cantidad de copias del libro
    @Override
    protected void actualizarCantidadMaterial(Libro libro, int nuevaCantidad) {
        libro.setCantidadCopias(nuevaCantidad);
    }
}
