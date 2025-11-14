
package TP_5.EJ_11;

public class Reproductor {

    // Constructor vacío, no necesita estado.
    public Reproductor() {
    }
    
    /**
     * Este método crea la DEPENDENCIA de USO.
     * La clase Reproductor "usa" la clase Cancion temporalmente 
     * solo durante la ejecución de este método.
     * No almacena la 'cancion' como un atributo.
     */
    public void reproducir(Cancion cancion) {
        System.out.println("--- 🎵 REPRODUCIENDO 🎵 ---");
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
        System.out.println("---------------------------");
    }

}
