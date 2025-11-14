
package TP_5.EJ_14;

public class EditorVideo {

    public EditorVideo() {
        // Constructor vacío
    }

    /**
     * Dependencia de CREACIÓN:
     * Recibe el formato (String) y el Proyecto.
     * INSTANCIA (hace new) un objeto Render combinando ambos datos.
     */
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println(">>> Procesando renderizado...");
        System.out.println("...codificando " + proyecto.getNombre() + "...");
        
        // --- CREACIÓN DEL OBJETO ---
        Render videoFinal = new Render(formato, proyecto);
        
        System.out.println("Exportación finalizada:");
        System.out.println(videoFinal);
    }

}
