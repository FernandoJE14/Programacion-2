
package TP_5.EJ_10;

public class Titular {

    private String nombre;
    private String dni;
    // Referencia a la CuentaBancaria para la bidireccionalidad
    private CuentaBancaria cuenta; 

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters para la bidireccionalidad
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    
    // Getters esenciales para el toString() de CuentaBancaria
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        // Validación con if/else para la bidireccionalidad segura
        String cuentaInfo;
        if (cuenta != null) {
            // Se usa getCbu() en lugar de cuenta.toString() para evitar bucle
            cuentaInfo = " (CBU: " + cuenta.getCbu() + ")";
        } else {
            cuentaInfo = " (Sin Cuenta Asignada)";
        }
        
        return "Titular [nombre=" + nombre + ", dni=" + dni + cuentaInfo + "]";
    }

}
