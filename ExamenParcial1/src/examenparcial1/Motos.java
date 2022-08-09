/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class Motos extends VehiculoTerrestre{
    private String potencia;

    public Motos(String potencia, String terrestre, String modelo, String color, String peso, String capacidad) {
        super(terrestre, modelo, color, peso, capacidad);
        this.potencia = potencia;
    }
    

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    
}
