
package TP_5.EJ_7;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Motor (Objeto independiente para la AGREGACIÓN)
        Motor m = new Motor("V8", "V8-90123-A");

        // 2. Crear el Conductor
        Conductor c = new Conductor("Juan Pérez", "B-23456789");

        // 3. Crear el Vehículo (Agrega el Motor y Asocia al Conductor)
        Vehiculo v = new Vehiculo(
            "AA 123 BB", 
            "Ford Mustang", 
            m,  // Agregación
            c   // Asociación
        );

        System.out.println("--- EJERCICIO 7: VEHÍCULO - MOTOR - CONDUCTOR ---");
        
        // A) Mostrar el Vehículo (Demuestra Agregación y Conductor asociado)
        System.out.println(v);
        
        System.out.println("\n--- Prueba de Bidireccionalidad y Agregación ---");
        
        // B) Mostrar el Conductor (Demuestra que conoce al Vehículo)
        System.out.println(c);
        
        // C) Demostrar Agregación (El Motor sigue existiendo por sí solo)
        System.out.println("\nEl Motor sigue existiendo como objeto independiente: " + m.getTipo());
        
    }

}
