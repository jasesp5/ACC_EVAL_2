/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import classes.Tematica;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class TematicaRepository {

    private static String BD_BIBLIOTECA = "bDBbiblioteca.yap";
    private ObjectContainer dataBase;

    public void abrirBaseDeDatos() {
        this.dataBase = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), BD_BIBLIOTECA);
    }

    public void cerrarBaseDeDatos() {
        this.dataBase.close();
    }

    /**
     * Funcion que inserta la tematica
     *
     * @param tematica tematica
     * @return boolean
     */
    public boolean insertarTematica(Tematica tematica) {
        abrirBaseDeDatos();
        this.dataBase.store(tematica);
        cerrarBaseDeDatos();
        return true;
    }

    /**
     * Función que comprueba si existe la tematica que va insertar el usuario
     *
     * @param nombre String
     * @return boolean
     */
    public boolean comprobarTematicaSiExiste(String nombre) {
        abrirBaseDeDatos();
        Tematica tematica = new Tematica();
        ObjectSet<Tematica> tematicaBaseDeDatos = this.dataBase.queryByExample(tematica);
        while (tematicaBaseDeDatos.hasNext()) {
            if (tematicaBaseDeDatos.next().getNombre().equalsIgnoreCase(nombre)) {
                cerrarBaseDeDatos();
                return true;
            }
        }
        cerrarBaseDeDatos();
        return false;
    }

    /**
     * Funcion que obtiene la lista de tematicas de la base de datos
     *
     * @param tematica tematicas
     * @return ArrayList
     */
    public ArrayList<Tematica> mostrarTematica(Tematica tematica) {
        abrirBaseDeDatos();
        ObjectSet<Tematica> tematicaBaseDeDatos = dataBase.queryByExample(tematica);
        ArrayList<Tematica> tematicas = new ArrayList<>();
        while (tematicaBaseDeDatos.hasNext()) {
            Tematica tematicaMostrar = tematicaBaseDeDatos.next();
            tematicas.add(tematicaMostrar);
        }
        cerrarBaseDeDatos();
        return tematicas;
    }

    /**
     * Funcion que modifica el tema
     *
     * @param tematica tematica
     * @param nombreNuevo String
     * @return boolean
     */
    public boolean modificarTematica(Tematica tematica, String nombreNuevo) {
        abrirBaseDeDatos();
        ObjectSet<Tematica> tematicaBaseDeDatos = dataBase.queryByExample(tematica);
        Tematica tematicaModificada = tematicaBaseDeDatos.get(0);
        tematicaModificada.setNombre(nombreNuevo);
        tematicaModificada.setFechaDeModificacion(LocalDate.now());
        this.dataBase.store(tematicaModificada);
        cerrarBaseDeDatos();
        return true;

    }

}
