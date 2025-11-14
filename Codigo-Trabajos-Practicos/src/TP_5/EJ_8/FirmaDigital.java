
package TP_5.EJ_8;

public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    
    // Agregación Unidireccional: La FirmaDigital REFERENCIA un Usuario
    private Usuario usuario; 
    
    // No hay referencia a Documento (es Composición unidireccional)
    
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; // Asigna la agregación
    }

    @Override
    public String toString() {
        // Es seguro llamar a .toString() de Usuario, ya que no hay 
        // bidireccionalidad y no hay riesgo de bucle infinito.
        
        return "FirmaDigital [codigoHash=" + codigoHash.substring(0, 8) + "..., " +
               "fecha=" + fecha + ", " +
               "Firmante=" + usuario.toString() + "]"; // Muestra el Usuario agregado
    }

}
