/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garrafonesabstractos;

import implementacion.Bonafont;
import implementacion.Santorini;

/**
 *
 * @author Kala
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Santorini santorini = new Santorini("Santorini");
       santorini.gritar();
       santorini.setCapacidad(20);
        
       //Santorini.gritar1();
        //System.out.println("\n\n\n\n\n"); este es un método estático(que se ejecuta con la clase)
        
       Bonafont bonafont = new Bonafont("Bonafont", 20);
       bonafont.gritar();
       
       
       System.out.println("Marca:" + bonafont.getMarca());
       
        
    }
    
}
