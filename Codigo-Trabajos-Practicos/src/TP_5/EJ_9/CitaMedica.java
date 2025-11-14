
package TP_5.EJ_9;

public class CitaMedica {

    private String fecha;
    private String hora;
    
    // Asociación Unidireccional: CitaMedica conoce a Paciente
    private Paciente paciente; 
    
    // Asociación Unidireccional: CitaMedica conoce a Profesional
    private Profesional profesional; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        
        // Asignación de las Asociaciones
        this.paciente = paciente; 
        this.profesional = profesional; 
    }
    
    @Override
    public String toString() {
        // Es 100% seguro llamar a .toString() de las otras clases
        // porque las relaciones son unidireccionales (no hay bucle).
        
        return "--- CITA MÉDICA ---\n" +
               "\t- Fecha: " + fecha + "\n" +
               "\t- Hora: " + hora + "\n" +
               "\t- " + paciente.toString() + "\n" +
               "\t- " + profesional.toString();
    }

}
