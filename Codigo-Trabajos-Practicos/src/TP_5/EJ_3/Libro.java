
package TP_5.EJ_3;

public class Libro {
    
    private String titulo;
    private String isbn;

    // Asociación Unidireccional: Solo Libro tiene referencia a Autor
    private Autor autor; 
    
    // Agregación Unidireccional: Solo Libro tiene referencia a Editorial
    private Editorial editorial; 

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        
        // Asignación de la Asociación y la Agregación
        this.autor = autor; 
        this.editorial = editorial; 
    }
    
    /*@Override
    public String toString() {
        // Uso de \n y \t para formato de salida legible
        return "--- FICHA DEL LIBRO ---\n" +
               "\tTítulo: " + titulo + "\n" +
               "\tISBN: " + isbn + "\n" +
               "\tAutor: " + autor.getNombre() + " (" + autor.toString() + ")\n" +
               "\tEditorial: " + editorial.getNombre() + " (" + editorial.toString() + ")";
    }*/

    @Override

    public String toString() {
        // Uso de \n y \t para formato de salida legible
        return "--- FICHA DEL LIBRO ---\n" +
               "\tTítulo: " + titulo + "\n" +
               "\tISBN: " + isbn + "\n" +
               "\t" + autor.toString() + "\n" +
               "\t" + editorial.toString();
    }
    
    

}
