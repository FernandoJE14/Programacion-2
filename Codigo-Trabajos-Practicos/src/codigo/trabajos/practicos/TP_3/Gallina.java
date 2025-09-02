
package codigo.trabajos.practicos.TP_3;

public class Gallina {
    
    public String idGallina;
    public int edad;
    public int huevosPuestos;
    
    public void mostrarEstado() {
        System.out.println("ID: "+idGallina+" Edad: "+edad+" Huevos puestos: "+huevosPuestos);
    }
    
    public void ponerHuevo() {
        huevosPuestos ++;
    }
    
    public void envejecer() {
        edad ++;
    }
}
