package lab6_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarPeliculas {

    private ArrayList<Pelicula> lista_pelis = new ArrayList<>();
    private File archivo;

    public AdministrarPeliculas(String path) {
        archivo = new File(path);

    }

    public ArrayList<Pelicula> getLista_pelis() {
        return lista_pelis;
    }

    public void setLista_pelis(ArrayList<Pelicula> lista_pelis) {
        this.lista_pelis = lista_pelis;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarPeliculas{" + "lista_pelis=" + lista_pelis + '}';
    }

    public void setPelicula(Pelicula p) {
        this.lista_pelis.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Pelicula pelis : lista_pelis) {
                bw.write(pelis.getNombre() + ";");
                bw.write(pelis.getMinutos() + ";");
                bw.write(pelis.getCategoria() + ";");
                bw.write(pelis.getDirector() + ";");
                bw.write(pelis.getCompañia() + ";");
                bw.write(pelis.getIdioma() + ";");
                bw.write(pelis.getIdioma() + ";");
                bw.write(pelis.getSubtitulos_español() + ";");
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
        lista_pelis = new ArrayList<>();
        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter(";");
                while (lea.hasNext()) {
                    ArrayList<ActorPelicula> temp = new ArrayList<>();
                    //atributos de la serie
                    String nom = "", cat = "", director = "", compañia = "", idioma = "", dub = "", sub = "";
                    int min = 0;
                    //nombre actor
                    String nombreActor = "";

                    nom = lea.next();
                    min = lea.nextInt();
                    cat = lea.next();
                    director = lea.next();
                    compañia = lea.next();
                    idioma = lea.next();
                    dub = lea.next();
                    sub = lea.next();
                    nombreActor = lea.next();
                    Scanner lea2 = new Scanner(lea.next());
                    lea2.useDelimiter(",");
                    while (lea2.hasNext()) {
                        temp.add(new ActorPelicula(nombreActor));
                    }
                    
                    lista_pelis.add(new Pelicula(nom, min, compañia, director, compañia, idioma, dub, compañia));
                    lista_pelis.get(lista_pelis.size()-1).setActores(temp);
                }
            } catch (Exception e) {
            } finally {
                lea.close();
            }
        }
    }
}
