
package TP_5.EJ_13;

public class GeneradorQR {

    public GeneradorQR() {
        // Constructor vacío
    }

    /**
     * Dependencia de CREACIÓN:
     * Este método instancia (hace 'new') un objeto CodigoQR.
     * El Generador "depende" de la clase CodigoQR para poder crearla.
     */
    public void generar(String valor, Usuario usuario) {
        System.out.println(">>> Generando código...");
        
        // --- AQUÍ OCURRE LA CREACIÓN ---
        CodigoQR nuevoQR = new CodigoQR(valor, usuario);
        
        // En este caso, como retorna void, lo mostramos por pantalla
        System.out.println("Código generado exitosamente:");
        System.out.println(nuevoQR);
    }

}
