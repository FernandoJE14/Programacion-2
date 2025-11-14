
package TP_5.EJ_14;

public class Proyecto {

    private String nombre;
    private int duracionMin;

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "'" + nombre + "' (" + duracionMin + " min)";
    }

}
