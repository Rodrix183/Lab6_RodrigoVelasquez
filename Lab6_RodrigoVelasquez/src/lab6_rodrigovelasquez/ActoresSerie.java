
package lab6_rodrigovelasquez;

public class ActoresSerie {
private String nombre;

    public ActoresSerie() {
    }

    public ActoresSerie(String nombre) {
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
