
package TP_4;

public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleado (int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado (String nombre, String puesto) {
        this.id = totalEmpleados + 1; // Asigna un ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800000.00; // Salario por defecto
        totalEmpleados++;
    }
    
    public void actualizarSalario(double aumento) {
        this.salario += this.salario * (aumento / 100); 
    }
    
    public void actualizarSalario() {
        this.salario = salario + 150000.00;
    }
    
    @Override
    public String toString () {
        return "Empleado[id = "+ id +", nombre = "+ nombre +", puesto = "+ puesto +", salario = "+ salario +"]";
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {       
        this.id = id;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }    
    }        

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        }        
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

}
