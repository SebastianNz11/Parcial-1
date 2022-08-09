/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class Helicoptero extends VehiculoAereo{
    private String helice;

    public Helicoptero(String helice, String aire, String modelo, String color, String peso, String capacidad) {
        super(aire, modelo, color, peso, capacidad);
        this.helice = helice;
    }
    
    

    public String getHelice() {
        return helice;
    }

    public void setHelice(String helice) {
        this.helice = helice;
    }

   
    
}
