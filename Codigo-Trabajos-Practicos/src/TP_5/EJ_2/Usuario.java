
package TP_5.EJ_2;

public class Usuario {
    
    private String nombre;
    private String dni;
    // Referencia al Celular (para la asociación bidireccional)
    private Celular celular; 

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter y Setter para establecer la relación bidireccional
    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
    
    // Método de utilidad
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    
    @Override
public String toString() {
    // 1. Declarar la variable que almacenará la información del celular
    String celularInfo;

    // 2. Usar un if/else clásico para asignar el valor de forma segura
    if (celular != null) {
        // Asigna la información detallada si el celular está asociado
        celularInfo = " (Celular: " + celular.getMarca() + " " + celular.getModeloCelular() + ")";
    } else {
        // Asigna la cadena por defecto si no hay celular
        celularInfo = " (Sin Celular)";
    }

    // 3. Retorna la cadena final combinando los datos del Usuario y la información del Celular
    return "Usuario [dni=" + dni + ", nombre=" + nombre + celularInfo + "]";
}

}
