/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.examen.entidades.Propietario;

/**
 *
 * @author Luis Aroche
 */
public interface PropietarioRepositorio extends JpaRepository<Propietario, Long> {
    
}
