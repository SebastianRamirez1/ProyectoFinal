package controller;

import model.Revista;

public class RevistaController extends MaterialController<Revista> {

    // Implementación del método abstracto para obtener el título de la revista
    @Override
    protected String obtenerTitulo(Revista revista) {
        return revista.getTitulo();
    }

    // Implementación del método abstracto para actualizar la cantidad de copias de la revista
    @Override
    protected void actualizarCantidadMaterial(Revista revista, int nuevaCantidad) {
        revista.setCantidadCopias(nuevaCantidad);
    }
}
