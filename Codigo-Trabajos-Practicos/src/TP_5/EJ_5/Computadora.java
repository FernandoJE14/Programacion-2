
package TP_5.EJ_5;

public class Computadora {

    private String marca;
    private String numeroSerie;
    
    // Composición: La Computadora CONTIENE la PlacaMadre
    private PlacaMadre placaMadre; 
    
    // Asociación Bidireccional
    private Propietario propietario; 

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        
        // Inicialización de la Composición: La PlacaMadre se crea aquí.
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
        
        // Inicialización de la Asociación
        this.propietario = propietario; 
                
        propietario.setComputadora(this);
    }
    
    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    @Override
    public String toString() {
        String propietarioNombre;
        if (propietario != null) {
            propietarioNombre = propietario.getNombre();
        } else {
            propietarioNombre = "N/A";
        }
        
        return "--- COMPUTADORA ---\n" +
               "\t- Marca: " + marca + "\n" +
               "\t- Serie: " + numeroSerie + "\n" +
               "\t- Propietario: " + propietarioNombre + " (Asoc. Bidireccional)\n" +
               "\t- Componente: " + placaMadre.toString() + " (Composición)";
    }

}
