/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.firsthiber.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author marianela
 */

@Entity
@Table(name="ciudadano")
@DiscriminatorValue("E")
public class Estudiante extends Ciudadano {
    
    
    
    @Column(name="nivel")
    private String nivel;
    
    @Column(name="legajo")
    private String legajo;
    
    public Estudiante(String nombre, String apellido, String mail, String nivel, String legajo ){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.legajo = legajo;
        this.nivel = nivel;
        
        
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nivel=" + nivel + ", legajo=" + legajo + '}';
    }
    
    

    
    
    
}
