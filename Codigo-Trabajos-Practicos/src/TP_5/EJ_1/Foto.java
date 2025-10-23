
package TP_5.EJ_1;

public class Foto {
    
    private String imagen;
    private String formato;

    // Constructor necesario para la Composición
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Método para mostrar el estado de la foto
    @Override
    public String toString() {
        return "Foto [formato=" + formato + ", imagen=" + (imagen.length() > 15 ? imagen.substring(0, 15) + "..." : imagen) + "]";
    }

}
