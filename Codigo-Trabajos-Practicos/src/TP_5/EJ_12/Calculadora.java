
package TP_5.EJ_12;

public class Calculadora {

    public Calculadora() {
        // Constructor vacío, no mantiene estado
    }

    /**
     * Dependencia de USO:
     * Recibe un objeto 'Impuesto' como parámetro para procesarlo.
     * No se guarda el impuesto como atributo de la clase.
     */
    public void calcular(Impuesto impuesto) {
        System.out.println("--- 🧮 CALCULANDO IMPUESTO 🧮 ---");
        
        // Aquí se "usa" el objeto Impuesto y su asociación con Contribuyente
        double montoBase = impuesto.getMonto();
        double montoFinal = montoBase * 1.21; // Ejemplo: Agregando IVA (21%)

        System.out.println("Contribuyente: " + impuesto.getContribuyente().toString());
        System.out.println("Monto Base: $" + montoBase);
        System.out.println("Monto con Recargos (21%): $" + montoFinal);
        System.out.println("---------------------------------");
    }

}
