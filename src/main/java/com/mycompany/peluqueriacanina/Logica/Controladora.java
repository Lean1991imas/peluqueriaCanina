
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    

    public void guardar(String nombre, String raza, String color, String observaciones, String nombreDuenio, String celu, String Alergico, String Atencion) {
        
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelduenio(celu);
        
        
        
        Mascota masco = new Mascota();
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.getObservaciones();
        masco.setColor(color);
        masco.setUnDuenio(duenio);
        masco.setAtencion_especial(Atencion);
        masco.setAlergico(Alergico);
        
    
    controlPersis.guardar(duenio,masco);
    
    
    
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascotas(int num_cliente) {
        return controlPersis.traerMascota (num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombre, String raza, String color, String observaciones, String Alergico, String Atencion, String nombreDuenio, String celu) {
        masco.setNombre(nombre);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(Atencion);
        masco.setAlergico(Alergico);
        
    controlPersis.modificarMascota(masco);
    
    Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
    dueno.setNombre(nombre);
    dueno.setCelduenio(celu);
    this.modificarDuenio(dueno);
   
    
    }

    private Duenio buscarDuenio(int id_duenio) {
     return controlPersis.traerDuenio(id_duenio);   
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
    
    
    
    
}




