package controller;

import model.MaterialVideografico;

public class MaterialVideograficoController extends MaterialController<MaterialVideografico> {

    // Implementación del método abstracto para obtener el título del material videográfico
    @Override
    protected String obtenerTitulo(MaterialVideografico material) {
        return material.getTitulo();
    }

    // Implementación del método abstracto para actualizar la cantidad de copias del material videográfico
    @Override
    protected void actualizarCantidadMaterial(MaterialVideografico material, int nuevaCantidad) {
        material.setCantidadCopias(nuevaCantidad);
    }
}
