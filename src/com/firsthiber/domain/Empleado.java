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
public class Empleado  extends Ciudadano {
    
    @Column(name="sueldo")
    private double sueldo;
    
    @Column(name="obraSocial")
    private String obraSocial;
    
    @Column(name="antiguedad")
    private int antiguedad;
    
    
    public Empleado(String nombre, String apellido, String mail, double sueldo, String obraSocial, int antiguedad){
           super();
           this.nombre = nombre;
           this.apellido = apellido;
           this.mail = mail;
           this.obraSocial = obraSocial;
           this.antiguedad = antiguedad;   
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{ " + "sueldo=" + sueldo + ", obraSocial=" + obraSocial + ", antiguedad=" + antiguedad + '}';
    }
    
    
    
    
}
