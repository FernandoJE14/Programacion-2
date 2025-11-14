
package TP_5.EJ_6;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Cliente (independiente)
        Cliente c1 = new Cliente("Carlos Sanchez", "223-5678901");

        // 2. Crear la Mesa (independiente - AGREGACIÓN)
        Mesa m5 = new Mesa(5, 4); // Mesa 5, 4 personas

        // 3. Crear la Reserva (Asocia a Cliente y Agrega a Mesa)
        Reserva r1 = new Reserva(
            "2025-11-10", 
            "21:30", 
            c1, // Asociación
            m5  // Agregación
        );

        System.out.println("--- EJERCICIO 6: RESERVA - CLIENTE - MESA ---");
        
        // A) Mostrar la Reserva (Demuestra que conoce al Cliente y la Mesa)
        System.out.println(r1);
        
        System.out.println("\n--- Prueba de Unidireccionalidad y Agregación ---");
        
        // B) Demostrar que los objetos agregados/asociados existen por sí solos
        System.out.println("El Cliente sigue existiendo: " + c1.getNombre());
        System.out.println("La Mesa sigue existiendo: " + m5.getNumero());
        
        // C) Demostrar Unidireccionalidad:
        // No podemos hacer "c1.getReserva()", porque Cliente no conoce a Reserva.
        
    }

}
