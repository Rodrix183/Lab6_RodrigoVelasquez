package lab6_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Serie serie : lista_series) {
                bw.write(serie.getNombre() + ";");
                bw.write(serie.getMinutos_cap() + ";");
                bw.write(serie.getCategoria() + ";");
                bw.write(serie.getTemporadas() + ";");
                bw.write(serie.getProductora() + ";");
                bw.write(serie.getIdiomaOriginal() + ";");
                bw.write(serie.getDoblaje() + ";");
                bw.write(serie.getSubtitulos_español() + ";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner lea = null;
        lista_series = new ArrayList<>();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter(";");
                while (lea.hasNext()) {
                    ArrayList<ActoresSerie> temp = new ArrayList<>();
                    //atributos de la serie
                    String nom = "", cat = "", prod = "", idioma = "", dub = "", sub = "";
                    int min = 0, season = 0;
                    //nombre actor
                    String nombreActor = "";

                    nom = lea.next();
                    min = lea.nextInt();
                    cat = lea.next();
                    season = lea.nextInt();
                    prod = lea.next();
                    idioma = lea.next();
                    dub = lea.next();
                    sub = lea.next();
                    nombreActor = lea.next();
                    Scanner lea2 = new Scanner(lea.next());
                    lea2.useDelimiter(",");
                    while (lea2.hasNext()) {
                        temp.add(new ActoresSerie(nombreActor));
                    }
                    lista_series.add(new Serie(nom, min, cat, season, prod, idioma, dub, sub));
                    lista_series.get(lista_series.size() - 1).setActores_principales(temp);
                }
            } catch (Exception e) {
            } finally {
                lea.close();
            }
        }

    }

}
