
package TP_5.EJ_9;

public class Paciente {

    private String nombre;
    private String obraSocial;
    // NOTA: No hay referencia a CitaMedica (es unidireccional)

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getObraSocial() {
        return obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", obraSocial=" + obraSocial + "]";
    }

}
