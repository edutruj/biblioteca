package proyecto_biblioteca;
import java.util.HashMap;
import java.util.Map;

public class Libreria {
    private Map<String, Libro> inventario;

    public Libreria() {
        this.inventario = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        if (inventario.containsKey(libro.getTitulo())) {
            System.out.println("El libro ya está en el inventario.");
        } else {
            inventario.put(libro.getTitulo(), libro);
            System.out.println("Libro agregado al inventario: " + libro.getTitulo());
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        return inventario.get(titulo);
    }

    public void buscarLibroPorAutor(String autor) {
        for (Libro libro : inventario.values()) {
            if (libro.getAutor().equals(autor)) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario de la librería:");
        for (Libro libro : inventario.values()) {
            System.out.println(libro);
        }
    }
}