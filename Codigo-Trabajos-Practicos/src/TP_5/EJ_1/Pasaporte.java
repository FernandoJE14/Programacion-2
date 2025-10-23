
package TP_5.EJ_1;

public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    
    // Composición: El Pasaporte CONTIENE una Foto.
    private Foto foto; 
    
    // Asociación Bidireccional: El Pasaporte tiene un Titular.
    private Titular titular; 

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        // Inicialización de la Composición: crea la Foto.
        this.foto = new Foto(imagenFoto, formatoFoto); 
        
        // Inicialización de la Asociación: establece el Titular.
        this.titular = titular; 
        
        // Establece la bidireccionalidad en el Titular
        titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + 
               ", fechaEmision=" + fechaEmision + 
               ", titular=" + titular.getNombre() + // Solo nombre para evitar bucle.
               ", foto=" + foto + // Llama a foto.toString()
               "]";
    }

}
