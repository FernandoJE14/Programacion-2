
package TP_5.EJ_2;

public class Bateria {
    
    private String modelo;
    private int capacidad; // Usamos int para mAh

    // La Batería puede existir por sí sola (se crea independientemente)
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Bateria [modelo=" + modelo + ", capacidad=" + capacidad + " mAh]";
    }

}
