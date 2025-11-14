
package TP_5.EJ_10;

public class CuentaBancaria {

    private String cbu;
    private double saldo;
    
    // Composición: La CuentaBancaria CONTIENE la ClaveSeguridad
    private ClaveSeguridad claveSeguridad; 
    
    // Asociación Bidireccional
    private Titular titular; 

    public CuentaBancaria(String cbu, double saldo, int codigoClave, String fechaClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        
        // --- INICIO DE LA COMPOSICIÓN ---
        // La CuentaBancaria crea y es dueña de su ClaveSeguridad
        this.claveSeguridad = new ClaveSeguridad(codigoClave, fechaClave);
        
        // --- INICIO DE LA ASOCIACIÓN BIDIRECCIONAL ---
        this.titular = titular; 
        titular.setCuenta(this); // Se establece el vínculo en la otra dirección
    }
    
    public String getCbu() {
        return cbu;
    }
    
    @Override
    public String toString() {
        
        // Validación con if/else para la bidireccionalidad segura
        String titularNombre;
        if (titular != null) {
            // Se usa getNombre() en lugar de titular.toString() para evitar bucle
            titularNombre = titular.getNombre();
        } else {
            titularNombre = "N/A";
        }
        
        // Uso de \n y \t para formato de salida legible
        return "--- CUENTA BANCARIA ---\n" +
               "\t- CBU: " + cbu + "\n" +
               "\t- Saldo: $" + saldo + "\n" +
               "\t- Titular: " + titularNombre + " (Asoc. Bidireccional)\n" +
               "\t- Seguridad: " + claveSeguridad.toString() + " (Composición)";
    }

}
