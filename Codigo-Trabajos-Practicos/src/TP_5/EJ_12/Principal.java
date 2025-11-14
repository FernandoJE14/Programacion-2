
package TP_5.EJ_12;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Contribuyente
        Contribuyente c = new Contribuyente("Juan Perez", "20-12345678-9");

        // 2. Crear el Impuesto (Asocia al Contribuyente)
        Impuesto i = new Impuesto(5000.00, c);

        // 3. Crear la Calculadora
        Calculadora calc = new Calculadora();

        System.out.println("--- EJERCICIO 12: IMPUESTO - CONTRIBUYENTE - CALCULADORA ---");

        // 4. Ejecutar el método que crea la Dependencia
        // La calculadora "usa" el impuesto 'i' en este momento.
        calc.calcular(i);
        
        // Si cambiamos el impuesto, la calculadora lo procesa sin problemas
        // porque no guarda estado del impuesto anterior.
        
    }

}
