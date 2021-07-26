/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.controladores;

import java.net.URI;
import java.util.List;
import org.examen.entidades.Propietario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.examen.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Luis Aroche
 */

@RestController
@RequestMapping("/api/propietario")
public class PropietarioController {
   
   @Autowired
   private PropietarioService propietarioService;    
   
   @PostMapping
   private ResponseEntity<Propietario> guardar(@RequestBody Propietario propietario){
       Propietario temporal = propietarioService.create(propietario);
       
       try{
           return ResponseEntity.created(new URI("/api/propietario" + temporal.getId())).body(temporal);
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
   }
   
   @GetMapping
   private ResponseEntity<List<Propietario>> listar(@RequestBody Propietario propietario){
       return ResponseEntity.ok(propietarioService.getAllPropietario());
   }
   
   
    @DeleteMapping
   
	private ResponseEntity<Void> eliminar (@RequestBody Propietario propietario){
		propietarioService.delete(propietario);
		return ResponseEntity.ok().build();
        }
   
}
