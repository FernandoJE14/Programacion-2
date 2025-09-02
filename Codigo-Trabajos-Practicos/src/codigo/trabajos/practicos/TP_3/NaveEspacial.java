
package codigo.trabajos.practicos.TP_3;

public class NaveEspacial {
    
    public String nombre;
    public int combustible;
    
    private final int MAX_COMBUSTIBLE = 50;
    
    public void mostrarEstado() {
        System.out.println("Nombre: "+ nombre +" Combustible: "+ combustible);
    }
    
    public void despegar() {
        System.out.println("Despegando");
    }
    
    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println("Distancia recorrida: " + distancia);
        } else {
            System.out.println("No hay suficiente combustible para avanzar!");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        int totalPosible = combustible + cantidad;
        if (totalPosible > MAX_COMBUSTIBLE) {            
            System.out.println("Recarga fallida: se superó el límite de combustible");
        } else {
            combustible += cantidad;
            System.out.println("Recarga exitosa. Combustible actual: " + combustible);
        }            
    }

}
