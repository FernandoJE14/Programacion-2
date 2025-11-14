
package TP_5.EJ_8;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Usuario (Objeto independiente para la AGREGACIÓN)
        Usuario u = new Usuario("Lucía Méndez", "lucia.mendez@legal.com");

        // 2. Crear el Documento (Esto inicializa la FirmaDigital por COMPOSICIÓN)
        // Se le pasa el Usuario 'u' para que la FirmaDigital lo Agregue.
        Documento d = new Documento(
            "Contrato de Confidencialidad", 
            "El presente documento establece los términos...", 
            "a1b2c3d4e5f67890...", // hashFirma
            "2025-11-06",        // fechaFirma
            u                    // firmante (para la Agregación)
        );

        System.out.println("--- EJERCICIO 8: DOCUMENTO - FIRMA - USUARIO ---");
        
        // A) Mostrar el Documento (Demuestra la Composición y la Agregación anidada)
        System.out.println(d);
        
        System.out.println("\n--- Prueba de Agregación ---");
        
        // B) Demostrar Agregación (El Usuario sigue existiendo por sí solo)
        System.out.println("El Usuario firmante sigue existiendo como objeto independiente:");
        System.out.println(u.getNombre() + " (" + u.getEmail() + ")");
        
    }

}
