/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import clasesabstractas.Garrafon;


public class Santorini extends Garrafon {
    //ya tiene marca y capacidad, pero sólo estamos setteando la marca
    public Santorini(String marca){
        super (marca);
    }

    @Override
    public void gritar() {
        System.out.println("¡Agua santoriniiiiiiiiiiiiiii!");
    }
    
    public static void gritar1(){
        System.out.println("¡Agua !");
    }
    
}
