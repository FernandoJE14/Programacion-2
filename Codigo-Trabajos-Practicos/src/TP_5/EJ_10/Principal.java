
package TP_5.EJ_10;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Titular (objeto independiente)
        Titular ana = new Titular("Ana Torres", "30111222");

        // 2. Crear la CuentaBancaria (Esto inicializa la ClaveSeguridad por COMPOSICIÓN)
        CuentaBancaria ctaAna = new CuentaBancaria(
            "00001234567890001", 
            150000.50, 
            8080,             // codigoClave (para la Composición)
            "2025-10-01",     // fechaClave (para la Composición)
            ana               // titular (Asociación)
        );

        System.out.println("--- EJERCICIO 10: CUENTA - CLAVE - TITULAR ---");
        
        // A) Mostrar la CuentaBancaria (Demuestra Composición y Titular asociado)
        System.out.println(ctaAna);
        
        System.out.println("\n--- Prueba de Bidireccionalidad y Composición ---");
        
        // B) Mostrar el Titular (Demuestra que conoce la Cuenta)
        System.out.println(ana);
        
    }

}
