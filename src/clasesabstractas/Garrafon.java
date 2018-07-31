/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesabstractas;

//se declara constructor
public abstract class Garrafon {
    private String marca;
    private int capacidad;
    
    protected Garrafon(String marca){
        this.marca = marca;
    }
    
    protected Garrafon(String marca, int capacidad){
        this.marca = marca;
        this.capacidad = capacidad;
    }
    
    protected Garrafon(int capacidad){
        this.capacidad = capacidad;
    }
    //se pueden declarar métodos abstractos
    public abstract void gritar();

    //también métodos concretos
    public String getMarca() {
        return marca;
    }

    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
 
    
}
