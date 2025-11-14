
package TP_5.EJ_4;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    
    // Agregación Unidireccional
    private Banco banco; 
    
    // Asociación Bidireccional
    private Cliente cliente; 

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        
        this.banco = banco; 
        this.cliente = cliente; 
        
        // Completa la bidireccionalidad
        cliente.setTarjeta(this);
    }
    
    // Getter para el número (muestra solo una parte por seguridad)
    public String getNumero() {
        return "****" + numero.substring(numero.length() - 4);
    }
    
    @Override
    public String toString() {
        
        String clienteNombre;

        // Validación con if/else para la bidireccionalidad segura
        if (cliente != null) {
            // Se usa getNombre() en lugar de cliente.toString() para evitar StackOverflowError
            clienteNombre = cliente.getNombre();
        } else {
            clienteNombre = "N/A";
        }
        
        // Uso de \n y \t para formato de salida legible
        return "--- TARJETA DE CRÉDITO ---\n" +
               "\t- Número: " + getNumero() + "\n" +
               "\t- Vencimiento: " + fechaVencimiento + "\n" +
               "\t- Titular: " + clienteNombre + " (Asociación Bidireccional)\n" +
               "\t- Banco: " + banco.getNombre() + " (Agregación Unidireccional)";
    }

}
