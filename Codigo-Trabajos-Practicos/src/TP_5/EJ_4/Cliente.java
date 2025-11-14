
package TP_5.EJ_4;

public class Cliente {
    
    private String nombre;
    private String dni;
    // Referencia al objeto TarjetaDeCredito para la bidireccionalidad
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setter para la bidireccionalidad
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        
        String tarjetaInfo;

        // Validación con if/else para la bidireccionalidad segura
        if (tarjeta != null) {
            // Se usa getNumero() en lugar de tarjeta.toString() para evitar StackOverflowError
            tarjetaInfo = " (Nro: " + tarjeta.getNumero() + ")"; 
        } else {
            tarjetaInfo = " (Sin Tarjeta)";
        }

        return "Cliente [dni=" + dni + ", nombre=" + nombre + tarjetaInfo + "]";
    }

}
