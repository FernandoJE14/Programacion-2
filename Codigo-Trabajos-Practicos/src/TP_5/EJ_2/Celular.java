
package TP_5.EJ_2;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    
    // Agregación: El Celular REFERENCIA una Bateria.
    private Bateria bateria; 
    
    // Asociación Bidireccional: El Celular tiene un Usuario.
    private Usuario usuario; 

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        
        // Inicialización de la Agregación: recibe el objeto ya creado.
        this.bateria = bateria; 
        
        // Inicialización de la Asociación: establece el Usuario.
        this.usuario = usuario; 
        
        // Establece la bidireccionalidad en el Usuario
        usuario.setCelular(this);
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModeloCelular() {
        return modelo;
    }
    
    @Override
public String toString() {
    // 1. Manejo de la relación bidireccional (Celular -> Usuario)
    // Se declara la variable para almacenar la información del usuario de forma segura
    String usuarioInfo;

    if (usuario != null) {
        // Se accede a un método simple del Usuario para obtener su nombre (evitando el bucle)
        usuarioInfo = " (Usuario: " + usuario.getNombre() + ", DNI: " + usuario.getDni() + ")";
    } else {
        usuarioInfo = " (Sin Usuario Asignado)";
    }
    
    // 2. Construcción de la cadena final
    return "Celular:\n" +
           "\t- IMEI: " + imei + "\n" +
           "\t- Marca: " + marca + "\n" +
           "\t- Modelo: " + modelo + "\n" +
           "\t- Batería: " + bateria + "\n" + 
           "\t- " + usuarioInfo;
}

}
