
package TP_5.EJ_7;

public class Vehiculo {

    private String patente;
    private String modelo;
    
    // Agregación Unidireccional
    private Motor motor; 
    
    // Asociación Bidireccional
    private Conductor conductor; 

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        
        // Asignación de la Agregación (recibe el Motor ya creado)
        this.motor = motor; 
        
        // Asignación de la Asociación
        this.conductor = conductor; 
        
        // Establece la bidireccionalidad en el Conductor
        conductor.setVehiculo(this);
    }
    
    public String getPatente() {
        return patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString() {
        
        // Validación con if/else para la bidireccionalidad segura
        String conductorNombre;
        if (conductor != null) {
            // Se usa getNombre() en lugar de conductor.toString()
            conductorNombre = conductor.getNombre();
        } else {
            conductorNombre = "N/A";
        }
        
        // Uso de \n y \t para formato de salida legible
        return "--- VEHÍCULO ---\n" +
               "\t- Patente: " + patente + "\n" +
               "\t- Modelo: " + modelo + "\n" +
               "\t- Conductor: " + conductorNombre + " (Asoc. Bidireccional)\n" +
               "\t- Componente: " + motor.toString() + " (Agregación)";
    }

}
