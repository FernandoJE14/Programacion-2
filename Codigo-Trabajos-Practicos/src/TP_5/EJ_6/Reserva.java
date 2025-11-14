
package TP_5.EJ_6;

public class Reserva {

    private String fecha;
    private String hora;
    
    // Asociación Unidireccional
    private Cliente cliente; 
    
    // Agregación Unidireccional
    private Mesa mesa; 

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        
        // Asignación de la Asociación (Reserva conoce a Cliente)
        this.cliente = cliente; 
        
        // Asignación de la Agregación (Reserva conoce a Mesa)
        this.mesa = mesa; 
    }
    
    @Override
    public String toString() {                
        return "--- DETALLE DE RESERVA ---\n" +
               "\t- Fecha: " + fecha + "\n" +
               "\t- Hora: " + hora + "\n" +
               "\t- " + cliente.toString() + "\n" +
               "\t- " + mesa.toString();
    }

}
