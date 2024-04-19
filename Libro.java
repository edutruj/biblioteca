package proyecto_biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numero;
    private String editorial;
    private int anoPublicacion;
    private double precio;

    public Libro(String titulo, String autor, int numero, String editorial, int anoPublicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero = numero;
        this.editorial = editorial;
        this.anoPublicacion = anoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero=" + numero +
                ", editorial='" + editorial + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", precio=" + precio +
                '}';
    }
}