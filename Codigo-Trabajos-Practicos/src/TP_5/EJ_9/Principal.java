
package TP_5.EJ_9;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Paciente (objeto independiente)
        Paciente p = new Paciente("Laura Gómez", "OSDE");

        // 2. Crear el Profesional (objeto independiente)
        Profesional d = new Profesional("Dr. Martín Pérez", "Cardiología");

        // 3. Crear la CitaMedica (Asocia a los dos objetos anteriores)
        CitaMedica c = new CitaMedica(
            "2025-11-15", 
            "10:30", 
            p, // Asociación a Paciente
            d  // Asociación a Profesional
        );

        System.out.println("--- EJERCICIO 9: CITA MÉDICA - PACIENTE - PROFESIONAL ---");
        
        // A) Mostrar la Cita (Demuestra que conoce a ambos)
        System.out.println(c);
        
        System.out.println("\n--- Prueba de Unidireccionalidad ---");
        
        // B) Demostrar que los objetos asociados existen por sí solos
        System.out.println("El Paciente sigue existiendo: " + p.getNombre());
        System.out.println("El Profesional sigue existiendo: " + d.getNombre());                       
    }

}
