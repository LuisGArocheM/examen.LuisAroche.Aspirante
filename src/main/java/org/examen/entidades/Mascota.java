/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.examen.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Luis Aroche
 */
public class Mascota {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id; 
   private String nombre;
   private String fechaNacimiento;
   private String raza;
   private String sexo;
   private int edad;
   private String descripcion;
   private TipoMascota tipo;
   private Propietario propietario;
   private Vacunas vacunas;

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }
    
    

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public TipoMascota getTipo() {
        return tipo;
    }
    
    

    public Propietario getPropietario() {
        return propietario;
    }

    public Vacunas getVacunas() {
        return vacunas;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(TipoMascota tipo) {
        this.tipo = tipo;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setVacunas(Vacunas vacunas) {
        this.vacunas = vacunas;
    }
    
    
   
    
    
    
   
   
   
   
}
