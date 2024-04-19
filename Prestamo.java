package proyecto_biblioteca;

public class Prestamo {

    private String tituloLibro;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String nombreUsuario;

    // Constructor
    public Prestamo(String tituloLibro, String fechaPrestamo, String fechaDevolucion, String nombreUsuario) {
        this.tituloLibro = tituloLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.nombreUsuario = nombreUsuario;
    }

    // Getters y setters

    @Override
    public String toString() {
        return "Prestamo{" +
                "tituloLibro='" + tituloLibro + '\'' +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                '}';
    }
}
