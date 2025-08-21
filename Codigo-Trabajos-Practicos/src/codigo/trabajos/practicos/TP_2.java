
package codigo.trabajos.practicos;

import java.util.Scanner;

public class TP_2 {
    final static double DESC = 0.10;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1)
        
        /*int año;        
        System.out.print("Ingrese un año: ");
        año = scan.nextInt();
        
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }*/
        
        /////////////////////////////////////////////////////////////
        
        // 2)
        
        /*int num, mayor = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un numero entero: ");
            num = scan.nextInt();
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El mayor es: "+ mayor);*/
        
        ////////////////////////////////////////////////////////////
        
        // 3)
        
        /*int edad;
        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un Niño");            
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }*/
        
        ///////////////////////////////////////////////////////////
        
        // 4)
        
        /*int precio;
        char categoria;
        
        System.out.print("Ingrese el precio: ");
        precio = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese la categoría A(10% OFF), B(15% OFF), C(20% OFF): ");
        categoria = scan.nextLine().charAt(0);
        
        switch (categoria) {
            case 'A':
            case 'a':
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: "+ (precio * 0.9));
                break;
            case 'B':
            case 'b':
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: "+ (precio * 0.85));
                break;
            case 'C':
            case 'c':
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: "+ (precio * 0.8));
                break;
            default:
                System.out.println("Categoria invalida");
                break;
        }*/
        
        //////////////////////////////////////////////////////
        
        // 5)
        
        /*int num = 1, suma = 0; // Se inicializa num con un numero impar para ingresar en el ciclo y que no se sume
        
        while (num != 0) {            
            System.out.print("Ingrese un numero (0 para finalizar): ");
            num = Integer.parseInt(scan.nextLine());
            
            if (num % 2 == 0) {
                suma += num;
            }                          
        }
        System.out.println("La suma de los numeros pares es: "+ suma);*/
        
        ////////////////////////////////////////////////////////
        
        // 6)
        
        /*int num, positivos = 0, negativos = 0, ceros = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero entero: ");
            num = Integer.parseInt(scan.nextLine());
            if (num > 0) {
                positivos += 1;
            } else if (num < 0) {
                negativos += 1;
            } else {
                ceros += 1;
            }            
        }
        System.out.println("Positivos: "+ positivos);
        System.out.println("Negativos: "+ negativos);
        System.out.println("Ceros: "+ ceros);*/
        
        //////////////////////////////////////////////////////////
        
        // 7)
        
        /*double nota;
        
        do {            
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = Double.parseDouble(scan.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");*/
        
        //////////////////////////////////////////////////////////
        
        // 8)
        
        /*double precioBase, impuesto, descuento;
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = Integer.parseInt(scan.nextLine());
        
        double precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        System.out.println("El precio final del producto es: "+ precioFinal);*/
        
        ///////////////////////////////////////////////////////////
        
        // 9)
        
        /*double precioProducto, peso;
        String zona;
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        peso = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        zona = scan.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, peso, zona);
        
        System.out.println("El costo de envio es: "+ costoEnvio);
        System.out.println("El total a pagar es: "+ total);*/
        
        //////////////////////////////////////////////////////
        
        // 10)
        
        /*int stockActual, cantidadVendida, cantidadRecibida;
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = scan.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = scan.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = scan.nextInt();
        
         int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: "+ nuevoStock);*/
        
        ////////////////////////////////////////////////////////
        
        // 11)
        
        /*double precio;
        System.out.print("Ingrese el precio del producto: ");
        precio = scan.nextDouble();
        
        calcularDescuentoEspecial(precio);*/
        
        ///////////////////////////////////////////////////////
        
        // 12)
        
        /*double[] preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        for (double precio : preciosOriginales) {
            System.out.println("Precio: $"+ precio);
        }
        System.out.println();
        
        System.out.println("Precios modificados:");
        preciosOriginales[2] = 129.99;
        for (double precio : preciosOriginales) {
            System.out.println("Precio: $"+ precio);
        }*/
        
        //////////////////////////////////////////////////////
        
        // 13)
        
        /*double[] preciosOriginales = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        mostrarPrecios(preciosOriginales, 0);
        System.out.println();
        
        preciosOriginales[2] = 129.99;
        System.out.println("Precios modificados:");
        mostrarPrecios(preciosOriginales, 0);*/
        
    } // cierre main
    
    // 8)
    
    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double precioFinal = precioBase + (precioBase * impuesto/100) - (precioBase * descuento/100);
        return precioFinal;
    }
    
    ///////////////////////////////////////////////////
    
    // 9)
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        } 
    }
    
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        return precioProducto + calcularCostoEnvio(peso, zona);
    }
    
    /////////////////////////////////////////////////////////
    
    // 10)
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    ///////////////////////////////////////////////////////
    
    // 11)
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESC; // uso la constante DESC
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    /////////////////////////////////////////////////////////
    
    // 13)
    
    public static void mostrarPrecios(double[] lista, int indice) {
        // Caso base: La recursión se detiene cuando el índice es igual a la longitud del array
        if (indice >= lista.length) {
            return;
        }
        System.out.println("Precio: $"+ lista[indice]);
        mostrarPrecios(lista, indice + 1);
    }
    
} // cierre TP2
