
package codigo.trabajos.practicos.TP_3;

public class TP_3 {        
    
    public static void main(String[] args) {
        
       // 1)
       
       /*Estudiantes es = new Estudiantes();
       es.nombre = "Fernando";
       es.apellido = "Javier";
       es.curso = "Programacion";
       
       es.mostrarInfo();
       
       es.setSubirCalificacion(8.5);
       es.mostrarInfo();
       
       es.setBajarCalificacion(2);
       es.mostrarInfo();*/
       
       ////////////////////////////////////////////
       
       // 2)
       
       /*Mascota m = new Mascota();
       m.nombre = "Firu";
       m.especie = "Beagle";
       
       m.mostrarInfo();
       
       m.cumplirAnios();
       m.mostrarInfo();
       m.cumplirAnios();
       m.cumplirAnios();
       m.cumplirAnios();
       m.mostrarInfo();*/
       
       //////////////////////////////////////////
       
       // 3)
       
       /*Libro l = new Libro();
       
       l.setTitulo("Coders at Work");
       System.out.println("Titulo: "+l.getTitulo());
       
       l.setAutor("Peter Seibel");
       System.out.println("Autor: "+ l.getAutor());
       
       l.setAñoPublicacion(-2009);
        System.out.println();
       
       System.out.println("Titulo: "+l.getTitulo());
       System.out.println("Autor: "+ l.getAutor());
       l.setAñoPublicacion(2009);
       System.out.println("Año de publicacion: "+ l.getAnioPublicacion());*/
       
       /////////////////////////////////////////
       
       // 4)
       
       /*Gallina g = new Gallina();
       g.idGallina = "G123";
       
       g.mostrarEstado();
       
       g.ponerHuevo();
       g.envejecer();
       g.mostrarEstado();
       
       g.ponerHuevo();
       g.ponerHuevo();
       g.envejecer();
       g.mostrarEstado();*/
       
       ////////////////////////////////////////////
       
       // 5)
       
       NaveEspacial n = new NaveEspacial();
       n.nombre = "Nave";
       n.combustible = 50;
       
       n.mostrarEstado();
       n.despegar();
       System.out.println(); // salto de linea
              
       n.avanzar(50);
       n.mostrarEstado();
       System.out.println(); // salto de linea
       
       n.recargarCombustible(100);
       System.out.println(); // salto de linea
       
       n.recargarCombustible(50);
       n.avanzar(100);
       n.avanzar(25);
       n.mostrarEstado();
    }

}
