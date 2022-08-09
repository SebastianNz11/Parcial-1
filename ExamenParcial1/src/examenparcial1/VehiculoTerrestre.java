/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial1;

/**
 *
 * @author sebas
 */
public class VehiculoTerrestre extends Vehiculos {

        private String terrestre;
        
        public VehiculoTerrestre(String terrestre, String modelo, String color, String peso, String capacidad) {
        super(modelo, color, peso, capacidad);
        this.terrestre = terrestre;
    }


    public String getTerrestre() {
        return terrestre;
    }

   
    public void setTerrestre(String terrestre) {
        this.terrestre = terrestre;
    }

    
    }
    
    


