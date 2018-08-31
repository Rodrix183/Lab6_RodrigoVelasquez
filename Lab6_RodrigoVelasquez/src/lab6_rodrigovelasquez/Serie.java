package lab6_rodrigovelasquez;

import java.util.ArrayList;

public class Serie {

private String nombre;
    private int minutos_cap;
    private String categoria;
    private ArrayList <String> actores_principales = new ArrayList<>();
    private int temporadas;
    private String productora;
    private String idiomaOriginal;
    private String doblaje;
    private String subtitulos_español;   

    public Serie() {
    }

    public Serie(String nombre, int minutos_cap, String categoria, int temporadas, String productora, String idiomaOriginal, String doblaje, String subtitulos_español) {
        this.nombre = nombre;
        this.minutos_cap = minutos_cap;
        this.categoria = categoria;
        this.temporadas = temporadas;
        this.productora = productora;
        this.idiomaOriginal = idiomaOriginal;
        this.doblaje = doblaje;
        this.subtitulos_español = subtitulos_español;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos_cap() {
        return minutos_cap;
    }

    public void setMinutos_cap(int minutos_cap) {
        this.minutos_cap = minutos_cap;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getActores_principales() {
        return actores_principales;
    }

    public void setActores_principales(ArrayList<String> actores_principales) {
        this.actores_principales = actores_principales;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubtitulos_español() {
        return subtitulos_español;
    }

    public void setSubtitulos_español(String subtitulos_español) {
        this.subtitulos_español = subtitulos_español;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
