
package TP_5.EJ_1;

public class Titular {
    
    private String nombre;
    private String dni;
    // Referencia al Pasaporte (para la asociación bidireccional)
    private Pasaporte pasaporte; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter y Setter para establecer la relación bidireccional
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
        
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        // Muestra la relación, pero evita el bucle infinito al imprimir todo el Pasaporte.
        String pasaporteInfo = (pasaporte != null) ? " (Pasaporte: " + pasaporte.getNumero() + ")" : " (Sin Pasaporte)";
        return "Titular [dni=" + dni + ", nombre=" + nombre + pasaporteInfo + "]";
    }

}
