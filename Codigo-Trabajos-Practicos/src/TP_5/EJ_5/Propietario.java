
package TP_5.EJ_5;

public class Propietario {

    private String nombre;
    private String dni;
    // Referencia a la Computadora para la bidireccionalidad
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter y Setter para la bidireccionalidad
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    
    // Getter esencial para el toString() de Computadora
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        // Validación con if/else para la bidireccionalidad segura
        String compInfo;
        if (computadora != null) {
            compInfo = " (Serie: " + computadora.getNumeroSerie() + ")";
        } else {
            compInfo = " (Sin Computadora)";
        }
        return "Propietario [nombre=" + nombre + ", dni=" + dni + compInfo + "]";
    }

}
