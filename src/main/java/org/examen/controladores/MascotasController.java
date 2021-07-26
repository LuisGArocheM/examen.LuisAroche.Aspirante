/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.controladores;

import java.net.URI;
import java.util.List;
import org.examen.entidades.Mascota;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.examen.service.MascotasService;
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
 * 
 */

@RestController
@RequestMapping("/api/mascotas")
public class MascotasController {
   
     @Autowired
   private MascotasService mascotaService;    
   
   @PostMapping
   private ResponseEntity<Mascota> guardar(@RequestBody Mascota mascota){
       Mascota temporal = mascotaService.create(mascota);
       
       try{
           return ResponseEntity.created(new URI("/api/propietario" + temporal.getId())).body(temporal);
       }catch(Exception e){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
       }
   }
   
   @GetMapping
   private ResponseEntity<List<Mascota>> listar(@RequestBody Mascota mascota){
       return ResponseEntity.ok(mascotaService.getAllMascotas());
   }
   
   
   @DeleteMapping
   
	private ResponseEntity<Void> eliminarMascota (@RequestBody Mascota mascota){
		mascotaService.delete(mascota);
		return ResponseEntity.ok().build();
	}
}
