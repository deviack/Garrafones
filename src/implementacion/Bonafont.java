/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import clasesabstractas.Garrafon;


public class Bonafont extends Garrafon{
    //ya tiene marca y capacidad,porque extiende de garrafon, sólo estamos setteandolos
    public Bonafont(String marca, int capacidad){
       // super (marca, capacidad);
       super (marca, capacidad);
       
    }
    @Override
    public void gritar() {
          System.out.println("¡Agua Bonafooooont!");
    }
    
    
}
