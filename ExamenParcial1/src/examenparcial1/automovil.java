/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class automovil extends VehiculoTerrestre{
    private String tierra;

    public automovil(String tierra, String terrestre, String modelo, String color, String peso, String capacidad) {
        super(terrestre, modelo, color, peso, capacidad);
        this.tierra = tierra;
    }
    
    

    public String getTierra() {
        return tierra;
    }

    public void setTierra(String tierra) {
        this.tierra = tierra;
    }

   
}
