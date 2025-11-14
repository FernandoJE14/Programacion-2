
package TP_5.EJ_11;

public class Principal {
        
    public static void main(String[] args) {

        // 1. Crear el Artista (objeto independiente)
        Artista a = new Artista("Queen", "Rock");

        // 2. Crear la Cancion (Asocia al Artista)
        Cancion c = new Cancion("Bohemian Rhapsody", a);
        
        // 3. Crear el Reproductor
        Reproductor miReproductor = new Reproductor();

        System.out.println("--- EJERCICIO 11: REPRODUCTOR - CANCION - ARTISTA ---");
        
        // 4. Ejecutar el método que crea la Dependencia
        // Se le pasa el objeto 'c' al método 'reproducir'
        miReproductor.reproducir(c);
        
        System.out.println("\n(La Dependencia existió solo durante la llamada al método)");
        
    }

}
