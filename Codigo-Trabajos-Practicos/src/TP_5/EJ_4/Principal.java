
package TP_5.EJ_4;

public class Principal {

    public static void main(String[] args) {
        
        // 1. Crear el Banco (Objeto independiente para la AGREGACIÓN)
        Banco b = new Banco("Banco Regional", "30-12345678-9");

        // 2. Crear el Cliente
        Cliente c = new Cliente("Marta López", "28987654");

        // 3. Crear la TarjetaDeCrédito (Agrega Banco y Asocia Cliente)
        TarjetaDeCredito t = new TarjetaDeCredito(
            "4567890123456789", 
            "12/28", 
            b,  
            c   
        );

        System.out.println("--- EJERCICIO 4: TARJETA - CLIENTE - BANCO ---");
        
        // A) Mostrar la Tarjeta (Demuestra Agregación y Cliente asociado)
        System.out.println(t);
        
        System.out.println("\n--- Prueba de la Bidireccionalidad ---");
        
        // B) Mostrar el Cliente (Demuestra que conoce la Tarjeta)
        System.out.println(c);
        
        // C) Demostrar que el Banco sigue existiendo (Agregación)
        System.out.println("\n--- Prueba de la Agregación (Banco) ---");
        System.out.println("El Banco asociado es: " + b.getNombre());
        
    }

}
