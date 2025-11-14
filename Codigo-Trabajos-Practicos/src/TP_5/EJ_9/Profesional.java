
package TP_5.EJ_9;

public class Profesional {

    private String nombre;
    private String especialidad;
    // NOTA: No hay referencia a CitaMedica (es unidireccional)

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Profesional [nombre=" + nombre + ", especialidad=" + especialidad + "]";
    }

}
