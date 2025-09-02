
package codigo.trabajos.practicos.TP_3;

public class Estudiantes {
    public String nombre;
    public String apellido;
    public String curso;
    private double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: "+nombre+" Apellido: "+apellido+" Curso: "+curso+" Calificacion: "+calificacion);
    }
    
    public void setSubirCalificacion(double puntos) {
        if (puntos > 0) {
           calificacion += puntos; 
        }         
    }
    
    public void setBajarCalificacion(double puntos) {
        if (puntos > 0) {
            calificacion -= puntos;
        }
    }
}
