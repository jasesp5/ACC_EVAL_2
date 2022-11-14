/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Shajinder
 */
public class Tematica {

    private String id;

    private String nombre;

    private LocalDate fechaDeAlta;

    private LocalDate fechaDeModificacion;

    public Tematica(String nombre) {
        this.id = generateId();
        this.nombre = nombre;
        this.fechaDeAlta = LocalDate.now();
    }
    
    public Tematica(){
    
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public LocalDate getFechaDeModificacion() {
        return fechaDeModificacion;
    }

    public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
        this.fechaDeModificacion = fechaDeModificacion;
    }

    public String generateId() {
        UUID idOne = UUID.randomUUID();
        return String.valueOf(idOne);
    }

    @Override
    public String toString() {
        return "Tematica{" + "id=" + id + ", nombre=" + nombre + ", fechaDeAlta=" + fechaDeAlta + ", fechaDeModificacion=" + fechaDeModificacion + '}';
    }

}
