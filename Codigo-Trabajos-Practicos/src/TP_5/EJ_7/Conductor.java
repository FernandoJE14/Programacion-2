
package TP_5.EJ_7;

public class Conductor {

    private String nombre;
    private String licencia;
    // Referencia al Vehiculo para la bidireccionalidad
    private Vehiculo vehiculo; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters y Setters para la bidireccionalidad
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    // Getters esenciales para los toString()
    public String getNombre() {
        return nombre;
    }
    
    public String getLicencia() {
        return licencia;
    }

    @Override
    public String toString() {
        // Validación con if/else para la bidireccionalidad segura
        String vehiculoInfo;
        if (vehiculo != null) {
            // Se usa getPatente() en lugar de vehiculo.toString()
            vehiculoInfo = " (Vehículo: " + vehiculo.getPatente() + ")";
        } else {
            vehiculoInfo = " (Sin Vehículo Asignado)";
        }
        
        return "Conductor [nombre=" + nombre + ", licencia=" + licencia + vehiculoInfo + "]";
    }

}
