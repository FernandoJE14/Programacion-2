
package TP_5.EJ_8;

public class Usuario {

    private String nombre;
    private String email;
    // NOTA: No hay referencia a FirmaDigital (es unidireccional)

    // El Usuario es independiente (Agregación)
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", email=" + email + "]";
    }

}
