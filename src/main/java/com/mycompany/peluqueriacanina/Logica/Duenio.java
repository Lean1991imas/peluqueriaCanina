
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String Celduenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String Celduenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.Celduenio = Celduenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelduenio() {
        return Celduenio;
    }

    public void setCelduenio(String Celduenio) {
        this.Celduenio = Celduenio;
    }
    
}
