package lab6_rodrigovelasquez;

public class Pelicula {
    private String nombre;
    private int minutos;
    private String categoria;

    public Pelicula() {
    }

    public Pelicula(String nombre, int minutos, String categoria) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
