/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busquedadlineal;

/**
 *
 * @author CIELO
 */
public class BusquedadLineal {

//BUSQUEDAD POR PRECIO 
public static void bucarProprecioMangas(){
    scanner dato = new Scanner( System.in);
    BaseDatos bd = new BaseDatos();
    
    System.out.println("\n ==== BUSQUEDAD POR PRECIO ====");
    
    try {
       System.out.print(" Ingrese preico Mínimo: s/");   
       double precioMin = dato.nextDouble();
       
       System.out.print(" Ingrese preico Máximo: s/");   
       double precioMax = dato.nextDouble();
       
       
      // Vlidación 
      if ( precioMin<0 || precioMax <0 || precioMin > precioMax){
           System.out.println( " ==== Reango de precios no válido ====");
           dato.nextLine();
      }
       
    }
}
}

