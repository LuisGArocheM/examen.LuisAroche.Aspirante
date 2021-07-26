/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.repositorios;

import org.examen.entidades.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Luis Aroche
 */
public interface MascotasRepositorio extends JpaRepository<Mascota, Long> {
    
}
