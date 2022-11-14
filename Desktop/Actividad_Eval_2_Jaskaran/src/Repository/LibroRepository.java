/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import classes.Libro;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class LibroRepository {

    private static String BD_BIBLIOTECA = "bDBbiblioteca.yap";
    private ObjectContainer dataBase;
    ArrayList<Libro> libro2 = new ArrayList<>();
    ArrayList<Libro> libro4 = new ArrayList<>();

    public void abrirBaseDeDatos() {
        this.dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BD_BIBLIOTECA);
    }

    public void cerrarBaseDeDatos() {
        this.dataBase.close();
    }

    /**
     * Función que devuele una lista con todos los libros
     *
     * @param libro Libros
     * @return ArrayList
     */
    public ArrayList<Libro> mostrarLibros(Libro libro) {
        abrirBaseDeDatos();
        ArrayList<Libro> libros = new ArrayList<>();
        ObjectSet<Libro> libroBaseDeDatos = dataBase.queryByExample(libro);

        while (libroBaseDeDatos.hasNext()) {
            Libro libroMostrar = libroBaseDeDatos.next();
            libros.add(libroMostrar);
        }
        cerrarBaseDeDatos();
        return libros;
    }

    /**
     * Función que inserta los libros
     *
     * @param libro Libro
     * @return boolean
     */
    public boolean insertraLibro(Libro libro) {
        try {
            abrirBaseDeDatos();
            this.dataBase.store(libro);
            cerrarBaseDeDatos();
            return true;
        } catch (DatabaseClosedException | DatabaseReadOnlyException e) {
            return false;
        }

    }

    /**
     * Funcion que obtiene un libro especifico
     *
     * @param libro
     * @return
     */
    public Libro obtenerUnObjetoSelecionado(Libro libro) {
        abrirBaseDeDatos();
        ObjectSet<Libro> libroBaseDeDatos = dataBase.queryByExample(libro);
        Libro libro2 = libroBaseDeDatos.get(0);
        cerrarBaseDeDatos();
        return libro2;
    }

    /**
     * Función modifica los libros
     *
     * @param libroViejo Libro
     * @param libroModificado String
     * @return boolean
     */
    public boolean modificarLibro(String libroViejo, Libro libroModificado) {
        try {
            abrirBaseDeDatos();
            Libro libro = new Libro();
            libro.setNombre(libroViejo);
            ObjectSet<Libro> objectSetLibro = dataBase.queryByExample(libro);
            Libro libroEnDB = objectSetLibro.get(0);
            this.dataBase.delete(libroEnDB);
            this.dataBase.store(libroModificado);
            cerrarBaseDeDatos();
            return true;
        } catch (DatabaseClosedException | DatabaseReadOnlyException | Db4oIOException e) {
            return false;
        }

    }

}
