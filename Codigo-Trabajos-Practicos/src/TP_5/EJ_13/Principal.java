
package TP_5.EJ_13;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Usuario (Dato de entrada)
        Usuario user = new Usuario("Empresa Tech", "contacto@tech.com");

        // 2. Crear el Generador
        GeneradorQR generador = new GeneradorQR();

        System.out.println("--- EJERCICIO 13: GENERADOR QR ---");

        // 3. Llamar al método generar
        // El generador crea internamente el CodigoQR y lo muestra.
        generador.generar("https://mi-sitio-web.com/perfil", user);
        
    }

}
