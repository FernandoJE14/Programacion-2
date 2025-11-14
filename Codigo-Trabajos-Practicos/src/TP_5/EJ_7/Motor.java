
package TP_5.EJ_7;

public class Motor {

    private String tipo;
    private String numeroSerie;
    // NOTA: No hay referencia a Vehiculo (es Agregación unidireccional)

    // El Motor se crea independientemente (Agregación)
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor [tipo=" + tipo + ", numeroSerie=" + numeroSerie + "]";
    }

}
