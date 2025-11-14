
package TP_5.EJ_5;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Propietario
        Propietario pablo = new Propietario("Pablo Díaz", "32765432");

        // 2. Crear la Computadora (Esto inicializa la PlacaMadre por Composición)
        Computadora pc = new Computadora(
            "Dell", 
            "XG-5544-A", 
            "GIGABYTE B550", // Modelo de PlacaMadre
            "AMD B550",      // Chipset de PlacaMadre
            pablo            // Propietario
        );

        System.out.println("--- EJERCICIO 5: COMPUTADORA - PLACAMADRE - PROPIETARIO ---");
        
        // A) Mostrar la Computadora (Demuestra Composición y Propietario asociado)
        System.out.println(pc);
        
        System.out.println("\n--- Prueba de Bidireccionalidad y Composición ---");
        
        // B) Mostrar el Propietario (Demuestra que conoce la Computadora)
        System.out.println(pablo); 
        
        // C) Demostrar Composición (si 'pc' deja de existir, 'placaMadre' también, conceptualmente)
        System.out.println("\n(La PlacaMadre no se puede referenciar ni existe sin la Computadora que la inicializó)");
    
    }

}
