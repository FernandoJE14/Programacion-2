
package TP_5.EJ_12;

public class Impuesto {

    private double monto;
    
    // Asociación Unidireccional: Impuesto conoce a Contribuyente
    private Contribuyente contribuyente;

    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente; // Asignación de la asociación
    }

    // Getters necesarios para que la Calculadora pueda usarlos
    public double getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

}
