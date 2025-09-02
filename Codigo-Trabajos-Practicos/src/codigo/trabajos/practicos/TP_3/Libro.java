
package codigo.trabajos.practicos.TP_3;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {        
        return anioPublicacion;                
    }

    public void setAñoPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año invalido");
        }        
    }
    
    

}
