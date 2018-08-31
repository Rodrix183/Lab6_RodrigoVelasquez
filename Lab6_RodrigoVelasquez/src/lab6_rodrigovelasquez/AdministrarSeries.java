package lab6_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AdministrarSeries {

    private ArrayList<Serie> lista_series = new ArrayList<>();
    private File archivo;

    public AdministrarSeries(String path) {
        archivo = new File(path);
    }

    public ArrayList<Serie> getLista_series() {
        return lista_series;
    }

    public void setLista_series(ArrayList<Serie> lista_series) {
        this.lista_series = lista_series;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "lista_series:" + lista_series;
    }

    public void setSerie(Serie s) {
        this.lista_series.add(s);
    }
    
    public void escribirArchivo() throws IOException{
     FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Serie serie : lista_series) {
                bw.write(serie.getNombre()+";");
                bw.write(serie.getMinutos_cap()+";");
                bw.write(serie.getCategoria()+";");
                bw.write(serie.getTemporadas()+";");
                bw.write(serie.getProductora()+";");
                bw.write(serie.getIdiomaOriginal()+";");
                bw.write(serie.getDoblaje()+";");
                bw.write(serie.getSubtitulos_español()+";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
    
    
    }
    
}
