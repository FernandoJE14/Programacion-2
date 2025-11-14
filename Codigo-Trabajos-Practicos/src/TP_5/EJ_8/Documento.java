
package TP_5.EJ_8;

public class Documento {

    private String titulo;
    private String contenido;
    
    // Composición: El Documento CONTIENE la FirmaDigital
    private FirmaDigital firmaDigital; 
    
    public Documento(String titulo, String contenido, String hashFirma, String fechaFirma, Usuario firmante) {
        this.titulo = titulo;
        this.contenido = contenido;
        
        // --- INICIO DE LA COMPOSICIÓN ---
        // El Documento crea su propia instancia de FirmaDigital.
        // La FirmaDigital no puede existir sin este Documento.
        // Le pasa el 'firmante' para que la FirmaDigital complete la Agregación.
        this.firmaDigital = new FirmaDigital(hashFirma, fechaFirma, firmante);
        // --- FIN DE LA COMPOSICIÓN ---
    }
    
    @Override
    public String toString() {
        // Es seguro llamar a .toString() de FirmaDigital, no hay bidireccionalidad.
        
        return "--- DOCUMENTO ---\n" +
               "\t- Título: " + titulo + "\n" +
               "\t- Contenido: " + contenido.substring(0, 20) + "...\n" +
               "\t- Firma: " + firmaDigital.toString() + " (Composición)";
    }

}
