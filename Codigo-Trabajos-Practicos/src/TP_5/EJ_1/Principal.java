
package TP_5.EJ_1;

public class Principal {
    
    public static void main(String[] args) {
        
        // 1. Crear el Titular
        Titular juan = new Titular("Juan Perez", "35876543");

        // 2. Crear el Pasaporte (Esto COMPONE la Foto y establece la Asociación Bidireccional)
        // El constructor de Pasaporte llama a new Foto(...) y llama a titular.setPasaporte(this).
        Pasaporte pasaporteJuan = new Pasaporte(
            "ARG890123", 
            "2025-10-20", 
            "datos_binarios_foto_juan", // imagenFoto
            "JPEG",                     // formatoFoto
            juan                        // titular
        );

        System.out.println("--- PRUEBA DE RELACIONES ---");
        
        // Prueba de Composición y Unidireccionalidad (Pasaporte conoce la Foto)
        System.out.println("1. Pasaporte de Juan (muestra la Foto):\n" + pasaporteJuan);

        // Prueba de Asociación Bidireccional (Titular conoce el Pasaporte)
        System.out.println("\n2. Titular (Juan) conoce su Pasaporte:");
        System.out.println("Nombre del Titular: " + juan.getNombre());
        System.out.println("Número del Pasaporte a través del Titular: " + juan.getPasaporte().getNumero());
        
        System.out.println("\n(La bidireccionalidad está establecida correctamente)");
    }
        
}

