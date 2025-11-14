
package TP_5.EJ_10;

public class ClaveSeguridad {

    private int codigo;
    private String ultimaModificacion;
    // NOTA: No hay referencia a CuentaBancaria (Composición unidireccional)
    
    public ClaveSeguridad(int codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=****, ultimaModificacion=" + ultimaModificacion + "]";
    }

}
