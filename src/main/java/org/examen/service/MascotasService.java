/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.service;

import java.util.List;
import org.examen.repositorios.MascotasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.examen.entidades.Mascota;

/**
 *
 * @author Luis Aroche
 */

@Service
public class MascotasService {
    
    @Autowired
    private MascotasRepositorio mascotaRepo;
    
    public Mascota create (Mascota propietario){
      return  mascotaRepo.save(propietario);
    }
    
    public List<Mascota> getAllMascotas(){
        return mascotaRepo.findAll();
    }
    
    public void delete(Mascota propietario){
        mascotaRepo.delete(propietario);
    }
    
    
    
}
