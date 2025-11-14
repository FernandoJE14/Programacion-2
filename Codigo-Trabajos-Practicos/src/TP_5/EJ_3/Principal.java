
package TP_5.EJ_3;

public class Principal {

    public static void main(String[] args) {
        
        // 1. Crear el Autor
        Autor autorNuevo = new Autor("Gabriel García Márquez", "Colombiana");

        // 2. Crear la Editorial (Objeto independiente para la AGREGACIÓN)
        Editorial editorialNueva = new Editorial("Sudamericana", "Av. Paseo de la Reforma 250");

        // 3. Crear el Libro (Asocia al Autor y Agrega la Editorial)
        Libro libro = new Libro(
            "Cien años de soledad", 
            "978-0307455295", 
            autorNuevo, 
            editorialNueva 
        );

        System.out.println("--- EJERCICIO 3: LIBRO - AUTOR - EDITORIAL ---");
        
        // 1. Mostrar el Libro (Demuestra las relaciones unidireccionales)
        System.out.println(libro);
        
        // 2. Demostrar la Agregación (la Editorial sigue existiendo si el libro desaparece conceptualmente)
        System.out.println("\n--- Prueba de la Editorial (Agregación) ---");
        System.out.println("La Editorial es un objeto independiente y reusable: " + editorialNueva);
        
    }

}
