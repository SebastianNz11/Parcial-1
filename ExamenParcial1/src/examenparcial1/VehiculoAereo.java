/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class VehiculoAereo extends Vehiculos {
    private String aire;

    public VehiculoAereo(String aire, String modelo, String color, String peso, String capacidad) {
        super(modelo, color, peso, capacidad);
        this.aire = aire;
    }
    
    

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }
    

    
}
