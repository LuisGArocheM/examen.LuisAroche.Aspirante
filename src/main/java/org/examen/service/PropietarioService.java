/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.service;

/**
 *
 * @author Luis Aroche
 */

import java.util.List;
import org.examen.repositorios.PropietarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.examen.entidades.Propietario;
        

@Service
public class PropietarioService {
    
    
    @Autowired
    private PropietarioRepositorio propietarioRepo;
    
    public Propietario create (Propietario propietario){
      return  propietarioRepo.save(propietario);
    }
    
    public List<Propietario> getAllPropietario(){
        return propietarioRepo.findAll();
    }
    
    public void delete(Propietario propietario){
        propietarioRepo.delete(propietario);
    }
    
    
    
}
