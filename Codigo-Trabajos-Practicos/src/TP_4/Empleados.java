
package TP_4;

public class Empleados {
    
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado(1, "Fernando", "Vendedor", 800000.00);
        Empleado e2 = new Empleado(2, "Roberto", "Cadete", 800000.00);        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(); // salto de linea
        
        // creacion de empleados con ID automatico y salario por defecto
        Empleado e3 = new Empleado("Franco", "Vendedor");
        Empleado e4 = new Empleado("Matias", "Cadete");        
        System.out.println(e3);
        System.out.println(e4);
        System.out.println();
        
        System.out.println("--- Actualizando salarios ---");
        e1.actualizarSalario(10);
        e4.actualizarSalario();
        System.out.println(e1);
        System.out.println(e4);
        System.out.println();
        
        System.out.println("Total de empleados creados: "+ Empleado.mostrarTotalEmpleados());
        
    }

}
