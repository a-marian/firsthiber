/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firsthiber;

import com.firsthiber.domain.Ciudadano;
import com.firsthiber.domain.Empleado;
import com.firsthiber.domain.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author marianela
 */
public class Principal {

    /**
     * @param args the command line arguments
     * 
     */
    public static ArrayList<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante est1 = new Estudiante("Lupita", "Juarez", "lupe@mail.com", "secundaria", "123QWQ");
        Estudiante est2 = new Estudiante("Carlitos", "Juarez", "lupe@mail.com", "secundaria", "123QWQ");
        Estudiante est3 = new Estudiante("Juanita", "Juarez", "lupe@mail.com", "secundaria", "123QWQ");
        
        Empleado emp1 = new Empleado("Jaimito1", "Falabella", "empleado1@mail.com", 10000.00, "MEDIFE", 3);
        Empleado emp2 = new Empleado("Jaimito2", "Falabella", "empleado2@mail.com", 10000.00, "MEDIFE", 3);
        Empleado emp3 = new Empleado("Jaimito3", "Falabella", "empleado3@mail.com", 10000.00, "MEDIFE", 3);
        Empleado emp4 = new Empleado("Jaimito4", "Falabella", "empleado4@mail.com", 10000.00, "MEDIFE", 3);
           
        ciudadanos.add(est1);
        ciudadanos.add(emp4);
        ciudadanos.add(emp1);
        ciudadanos.add(est2);
        ciudadanos.add(est3);
        
        
        System.out.println("All citizens begin each day a new grind:");
        
        for (Ciudadano ciudadano : ciudadanos){
            System.out.println(ciudadano.getNombre()+" "+ ciudadano.getApellido() );
        }
        
    }
    
}
