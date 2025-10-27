
package TP_5.EJ_2;

public class Principal {
   
    public static void main(String[] args) {
        
        // 1. Crear la Batería (creación independiente para la AGREGACIÓN)
        Bateria bateriaSamsung = new Bateria("EB-BG973ABU", 3400);

        // 2. Crear el Usuario
        Usuario ana = new Usuario("Ana Garcia", "30123456");

        // 3. Crear el Celular, pasando la Batería (Agregación) y el Usuario (Asociación)
        Celular cel = new Celular(
            "990000862468514", 
            "Samsung", 
            "Galaxy S10", 
            bateriaSamsung, // Objeto Bateria ya creado
            ana             // Objeto Usuario ya creado
        );

        System.out.println("--- PRUEBA DE RELACIONES (CELULAR) ---");
        
        // Prueba de Agregación y Unidireccionalidad (Celular conoce Batería)
        System.out.println("1. Información del Celular:\n" + cel);
        
        // Prueba de Asociación Bidireccional (Usuario conoce el Celular)
        System.out.println("\n2. Usuario (Ana) conoce su Celular:");
        System.out.println("Nombre del Usuario: " + ana.getNombre());
        System.out.println("Modelo del Celular a través del Usuario: " + ana.getCelular().getModeloCelular());
                
        
    }

}
