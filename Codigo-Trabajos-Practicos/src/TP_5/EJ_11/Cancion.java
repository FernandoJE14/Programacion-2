
package TP_5.EJ_11;

public class Cancion {

    private String titulo;
    
    // Asociación Unidireccional: Cancion conoce a Artista
    private Artista artista; 

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista; // Asigna la asociación
    }

    // Getters necesarios para el método reproducir()
    public String getTitulo() {
        return titulo;
    }
    
    public Artista getArtista() {
        return artista;
    }

    @Override
    public String toString() {        
        return "Cancion [titulo=" + titulo + ", " + artista.toString() + "]";
    }

}
