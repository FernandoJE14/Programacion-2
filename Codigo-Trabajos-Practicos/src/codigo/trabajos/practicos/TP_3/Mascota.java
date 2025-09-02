
package codigo.trabajos.practicos.TP_3;

public class Mascota {
    
    public String nombre;
    public String especie;
    public int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre+" Especie: "+especie+" Edad: "+edad);
    }
    
    public void cumplirAnios() {
        edad ++;        
    }

}
