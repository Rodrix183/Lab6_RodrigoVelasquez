package lab6_rodrigovelasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministrarUsuarios {

    private ArrayList<Usuario> lista_users = new ArrayList<>();
    private File archivo = null;
    private Usuario u;

    public AdministrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getLista_users() {
        return lista_users;
    }

    public void setLista_users(ArrayList<Usuario> lista_users) {
        this.lista_users = lista_users;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Usuarios{" + lista_users + '}';
    }

    public void setPersona(Usuario u) {
        this.lista_users.add(u);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Usuario us : lista_users) {
                bw.write(us.getNombre() + ";");
                bw.write(us.getCodigo() + ";");
                bw.write(us.getPassword() + ";");
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
        lista_users = new ArrayList<>();

        if (archivo.exists()) {
            try {
                lea = new Scanner(archivo);
                lea.useDelimiter(";");
                while (lea.hasNext()) {
                    String name , pass;
                    int code ;
                    name = lea.next();
                    code = lea.nextInt();
                    pass = lea.next();
                    lista_users.add(new Usuario(name, code, code));
                }
            } catch (Exception e) {
            } finally {
                lea.close();
            }
        }
    }
}
