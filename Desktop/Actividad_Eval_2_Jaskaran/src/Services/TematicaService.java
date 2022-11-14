/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repository.TematicaRepository;
import classes.Tematica;
import java.util.ArrayList;

/**
 *
 * @author Shajinder
 */
public class TematicaService {

    private TematicaRepository tematicaRepository;

    public TematicaService() {
        this.tematicaRepository = new TematicaRepository();
    }
    /**
     * Función que inserta la tematica y devuelve si se ha insertado correctamente
     * @param nombre String
     * @return boolean
     */
    public boolean insertarTematica(String nombre) {
        Tematica tematica = new Tematica(nombre);
        if (!this.tematicaRepository.comprobarTematicaSiExiste(nombre)) {
            return this.tematicaRepository.insertarTematica(tematica);
        }
        return false;
    }
    /**
     * Funcion que devuele la lista de tematicas
     * @return  ArrayList
     */
    public ArrayList<Tematica> mostrarTematicas(){
        Tematica tematica = new Tematica();
        return this.tematicaRepository.mostrarTematica(tematica);
    }
    /**
     * Funcion que modifica el tema
     * @param nombreAntiguo String 
     * @param nombreNuevo String
     * @return boolean
     */
    public boolean modificarTematica(String nombreAntiguo, String nombreNuevo){
        Tematica tematica = new Tematica();
        tematica.setNombre(nombreAntiguo);
        if (!this.tematicaRepository.comprobarTematicaSiExiste(nombreNuevo)) {
            return this.tematicaRepository.modificarTematica(tematica, nombreNuevo);
        }
        return false;
    }
}
