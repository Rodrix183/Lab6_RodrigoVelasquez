package lab6_rodrigovelasquez;

public class ActorPelicula {
    private String nombre;

    public ActorPelicula() {
    }

    public ActorPelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
