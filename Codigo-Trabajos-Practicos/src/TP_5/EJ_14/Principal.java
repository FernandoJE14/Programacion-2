
package TP_5.EJ_14;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Proyecto (Insumo)
        Proyecto vlog = new Proyecto("Vlog Vacaciones", 15);

        // 2. Crear el Editor
        EditorVideo premiere = new EditorVideo();

        System.out.println("--- EJERCICIO 14: EDITOR DE VIDEO ---");

        // 3. Exportar (El editor crea el Render internamente)
        premiere.exportar("mp4", vlog);
        
        System.out.println("\n--- Segunda exportación ---");
        // Podemos exportar el mismo proyecto en otro formato
        premiere.exportar("mov", vlog);
        
    }

}
