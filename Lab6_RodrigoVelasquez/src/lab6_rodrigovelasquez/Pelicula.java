package lab6_rodrigovelasquez;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private int minutos;
    private String categoria;
    private ArrayList <String> actores = new ArrayList<>();
    private String director;
    private String compañia;
    private String idioma;
    private String subtitulos_español;
    

    public Pelicula() {
    }

    public Pelicula(String nombre, int minutos, String categoria, String director, String compañia, String idioma, String subtitulos_español) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.categoria = categoria;
        this.director = director;
        this.compañia = compañia;
        this.idioma = idioma;
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

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
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
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
