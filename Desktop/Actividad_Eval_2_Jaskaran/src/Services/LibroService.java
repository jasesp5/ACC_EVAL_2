/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Repository.LibroRepository;
import classes.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shajinder
 */
public class LibroService {

    private LibroRepository libroRepository;

    public LibroService() {
        this.libroRepository = new LibroRepository();
    }

    /**
     * Función que se conecta con repository y devuel una lista de libros
     *
     * @return ArrayList
     */
    public ArrayList<Libro> mostrarLibros() {
        Libro libro = new Libro();
        return this.libroRepository.mostrarLibros(libro);
    }
    /**
     * Función que inserta el libro
     * @param nombre String
     * @param autor String
     * @param editorial String
     * @param yearPublicacion int
     * @param temas ArrayList
     * @return boolean
     */
    public boolean insertarLibro(String nombre, String autor, String editorial, int yearPublicacion, ArrayList<String> temas) {
        try {
            Libro libro = new Libro(nombre, autor, yearPublicacion, editorial);
            libro.setTematicas(temas);
            this.libroRepository.insertraLibro(libro);
            return true;
        } catch (Exception exception) {
            return false;
        }

    }
    /**
     * Función para obtener un libro selecionado
     * @param nombreLibro String
     * @return Libro
     */
    public Libro obtenerUnObjetoSelecionado(String nombreLibro) {
        Libro libro = new Libro();
        libro.setNombre(nombreLibro);
        return this.libroRepository.obtenerUnObjetoSelecionado(libro);
    }
    /**
     * Función que modifica el libro
     * @param nombreViejo String
     * @param nombreActual String
     * @param autor String 
     * @param editorial String
     * @param yearPublicacion int
     * @param temas ArrayList
     * @return  boolean
     */
    public boolean modificarLibro(String nombreViejo, String nombreActual, String autor, String editorial, int yearPublicacion, List<String> temas) {
        Libro libroModificado = new Libro(nombreActual, autor, yearPublicacion, editorial);
        libroModificado.setTematicas(temas);
        return this.libroRepository.modificarLibro(nombreViejo, libroModificado);
    }
    

}
