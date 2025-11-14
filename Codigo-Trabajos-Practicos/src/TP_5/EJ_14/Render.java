
package TP_5.EJ_14;

public class Render {

    private String formato;
    
    // Asociación Unidireccional: El Render conoce su Proyecto fuente
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "[ARCHIVO RENDERIZADO]\n" +
               "   Formato: ." + formato + "\n" +
               "   Fuente: " + proyecto.toString(); // Usa la asociación
    }

}
