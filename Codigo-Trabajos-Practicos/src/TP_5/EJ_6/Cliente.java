
package TP_5.EJ_6;

public class Cliente {

    private String nombre;
    private String telefono;
    // NOTA: No hay referencia a Reserva (es unidireccional)

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", telefono=" + telefono + "]";
    }

}
