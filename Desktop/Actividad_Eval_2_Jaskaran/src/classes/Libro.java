/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;
import com.db4o.collections.ActivatableArrayList;
import java.util.UUID;

/**
 *
 * @author Shajinder
 */
public class Libro {

    private String nombre;

    private String autor;

    private int yearPublicacion;

    private List<String> tematicas = new ActivatableArrayList<>();

    private String id;
    
    private String editorial;

    public String getEditorial() {
        return editorial;
    }

    public Libro(String nombre, String autor, int yearPublicacion,String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
        this.id = generateId();
        this.editorial = editorial;
    }

    public Libro() {

    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", yearPublicacion=" + yearPublicacion + ", tematicas=" + tematicas + ", id=" + id + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public void setTematicas(List<String> tematicas) {
        this.tematicas = tematicas;
    }

    public List<String> getTematicas() {
        return tematicas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void anadirTematica(String tematica) {
        this.tematicas.add(tematica);
    }

    public String generateId() {
        UUID idOne = UUID.randomUUID();
        return String.valueOf(idOne);
    }

}
