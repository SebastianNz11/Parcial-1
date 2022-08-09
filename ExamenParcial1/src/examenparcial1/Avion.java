/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class Avion extends VehiculoAereo {
    private String aereo1;

    public Avion(String aereo1, String aire, String modelo, String color, String peso, String capacidad) {
        super(aire, modelo, color, peso, capacidad);
        this.aereo1 = aereo1;
    }
    
    

    public String getAereo1() {
        return aereo1;
    }

    public void setAereo1(String aereo1) {
        this.aereo1 = aereo1;
    }

    
}
