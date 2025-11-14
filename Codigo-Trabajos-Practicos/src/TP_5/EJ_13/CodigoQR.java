
package TP_5.EJ_13;

public class CodigoQR {

    private String valor;
    
    // Asociación Unidireccional: El QR sabe a qué usuario pertenece
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        // Simulamos el gráfico del QR
        return "\n[ QR CODE ]\n" +
               "   DATA: " + valor + "\n" +
               "   LINKED TO: " + usuario.toString(); 
    }

}
