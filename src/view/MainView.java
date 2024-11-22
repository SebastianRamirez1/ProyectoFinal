package view;

import controller.LibroController;
import controller.RevistaController;
import controller.MaterialVideograficoController;
import model.Libro;
import model.Revista;
import model.MaterialVideografico;

import java.util.Scanner;

public class MainView {
    // Se crean las instancias de los controladores para cada tipo de material
    private LibroController libroController = new LibroController();
    private RevistaController revistaController = new RevistaController();
    private MaterialVideograficoController videoController = new MaterialVideograficoController();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        // Presentación del menú de opciones al usuario
        int opcion;
        do {
            mostrarMenu();
            opcion = obtenerOpcion();

            // Ejecuta la opción seleccionada
            switch (opcion) {
                case 1:
                    agregarMaterial(); 
                    break;
                case 2:
                    listarMaterial(); 
                    break;
                case 3:
                    eliminarMaterial();
                    break;
                case 4:
                    actualizarCantidad();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5); // El ciclo continúa hasta que el usuario elige salir

        scanner.close(); // Cierra el escáner al final
    }

    private void mostrarMenu() {
        // Muestra el menú de opciones
        System.out.println("\nBienvenido a la Biblioteca Municipal XYZ");
        System.out.println("1. Agregar Material");
        System.out.println("2. Listar Material");
        System.out.println("3. Eliminar Material");
        System.out.println("4. Actualizar Cantidad");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private int obtenerOpcion() {
        // Lee la opción seleccionada por el usuario
        return scanner.nextInt();
    }

    private void agregarMaterial() {
        // Permite agregar diferentes tipos de materiales
        System.out.println("1. Libro");
        System.out.println("2. Revista");
        System.out.println("3. Material Videográfico");
        System.out.print("Seleccione el tipo de material: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        // Se solicitan los detalles del material
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Editorial: ");
        String editorial = scanner.nextLine();
        System.out.print("Año de Publicación: ");
        int anio = scanner.nextInt();
        System.out.print("Cantidad de Copias: ");
        int cantidad = scanner.nextInt();

        // Según el tipo de material seleccionado, se agrega el objeto correspondiente
        switch (tipo) {
            case 1:
                libroController.agregarLibro(new Libro(titulo, autor, editorial, anio, cantidad));
                break;
            case 2:
                System.out.print("Tipo de Revista: ");
                scanner.nextLine();
                String tipoRevista = scanner.nextLine();
                revistaController.agregarRevista(new Revista(titulo, autor, editorial, anio, cantidad, tipoRevista));
                break;
            case 3:
                System.out.print("Duración (HH:MM): ");
                scanner.nextLine();
                String duracion = scanner.nextLine();
                System.out.print("Formato: ");
                String formato = scanner.nextLine();
                videoController.agregarMaterial(new MaterialVideografico(titulo, autor, editorial, anio, cantidad, duracion, formato));
                break;
            default:
                System.out.println("Tipo de material no válido.");
                break;
        }
    }

    private void listarMaterial() {
        // Lista todos los materiales disponibles: libros, revistas y materiales videográficos

        System.out.println("\nMateriales Disponibles:");
        
        // Listar Libros
        System.out.println("Libros:");
        libroController.listarLibros().forEach(libro -> {
            System.out.println(" - Título: " + libro.getTitulo());
            System.out.println("   Autor: " + libro.getAutor());
            System.out.println("   Editorial: " + libro.getEditorial());
            System.out.println("   Año: " + libro.getAnioPublicacion());
            System.out.println("   Copias disponibles: " + libro.getCantidadCopias());
            System.out.println();
        });

        // Listar Revistas
        System.out.println("Revistas:");
        revistaController.listarRevistas().forEach(revista -> {
            System.out.println(" - Título: " + revista.getTitulo());
            System.out.println("   Autor: " + revista.getAutor());
            System.out.println("   Editorial: " + revista.getEditorial());
            System.out.println("   Año: " + revista.getAnioPublicacion());
            System.out.println("   Tipo: " + revista.getTipoRevista());
            System.out.println("   Copias disponibles: " + revista.getCantidadCopias());
            System.out.println();
        });

        // Listar Material Videográfico
        System.out.println("Material Videográfico:");
        videoController.listarMateriales().forEach(material -> {
            System.out.println(" - Título: " + material.getTitulo());
            System.out.println("   Autor: " + material.getAutor());
            System.out.println("   Editorial: " + material.getEditorial());
            System.out.println("   Año: " + material.getAnioPublicacion());
            System.out.println("   Duración: " + material.getDuracion());
            System.out.println("   Formato: " + material.getFormato());
            System.out.println("   Copias disponibles: " + material.getCantidadCopias());
            System.out.println();
        });
    }

    private void eliminarMaterial() {
        // Permite eliminar un material por título
        System.out.print("\nTítulo del material a eliminar: ");
        scanner.nextLine();
        String tituloEliminar = scanner.nextLine();
        // Llama a los controladores para eliminar el material correspondiente
        libroController.eliminarLibro(tituloEliminar);
        revistaController.eliminarRevista(tituloEliminar);
        videoController.eliminarMaterial(tituloEliminar);
    }

    private void actualizarCantidad() {
        // Permite actualizar la cantidad de copias de un material
        System.out.print("\nTítulo del material a actualizar: ");
        scanner.nextLine();
        String tituloActualizar = scanner.nextLine();
        System.out.print("Nueva cantidad de copias: ");
        int nuevaCantidad = scanner.nextInt();
        // Llama a los controladores para actualizar la cantidad
        libroController.actualizarCantidad(tituloActualizar, nuevaCantidad);
        revistaController.actualizarCantidad(tituloActualizar, nuevaCantidad);
        videoController.actualizarCantidad(tituloActualizar, nuevaCantidad);
    }
}