package lab6_rodrigovelasquez;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private int minutos;
    private String categoria;
    private ArrayList <ActorPelicula> actores = new ArrayList<>();
    private String director;
    private String compañia;
    private String idioma;
    public String doblaje;
    private String subtitulos_español;
    

    public Pelicula() {
    }

    public Pelicula(String nombre, int minutos, String categoria, String director, String compañia, String idioma, String doblaje, String subtitulos_español) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.categoria = categoria;
        this.director = director;
        this.compañia = compañia;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subtitulos_español = subtitulos_español;
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

    public ArrayList<ActorPelicula> getActores() {
        return actores;
    }

    public void setActores(ArrayList<ActorPelicula> actores) {
        this.actores = actores;
    }

    

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getSubtitulos_español() {
        return subtitulos_español;
    }

    public void setSubtitulos_español(String subtitulos_español) {
        this.subtitulos_español = subtitulos_español;
    }    

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", minutos=" + minutos + ", categoria=" + categoria + ", actores=" + actores + ", director=" + director + ", compa\u00f1ia=" + compañia + ", idioma=" + idioma + ", doblaje=" + doblaje + ", subtitulos_espa\u00f1ol=" + subtitulos_español + '}';
    }
    
    
    
    
    
}
