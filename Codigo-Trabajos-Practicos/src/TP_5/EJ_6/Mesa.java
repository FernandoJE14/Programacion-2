
package TP_5.EJ_6;

public class Mesa {

    private int numero;
    private int capacidad;
    // NOTA: No hay referencia a Reserva (es unidireccional)

    // La Mesa existe independientemente de la Reserva (Agregación)
    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + " personas]";
    }

}
