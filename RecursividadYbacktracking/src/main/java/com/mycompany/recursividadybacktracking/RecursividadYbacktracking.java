/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividadybacktracking;

/**
 *
 * @author CIELO
 */
public class RecursividadYbacktracking {
// MANGAS_ANIME 
   // Método recursivo para calcular precio total similar al factorial 
    public double calcularTotalRecursivo(){
    return calcularPrecioRecursivo(this.cantidad , this.precio);
    }
    
    public double calcularPrecioRecursivo(int cantidad, double precioUnitario){
       if (cantidad == 0){
           return 0;
       }
       if (cantidad == 1){
           return precioUnitario;
       }
       else{
       return precioUnitario + calcularPrecioRecursivo ( cantidad - 1, precioUnitario);
   }
   }
   // Método Descuento por Cantidad 
   public double calcularDescuentoRecursivo(){
   return calcularDescuentoRecursivoHelper(this.cantidad, this.precio); 
   }
    private double calcularDescuentoRecursivoHelper (int cantidadRestante, double precioUnitario){
    if (cantidadRestante <= 0){
        return 0;
    }
    double precioMangaActual;
    //Aplica el descuento segun la cantidad
    if (cantidadRestante > 10 ){
        precioMangaActual = precioUnitario * 0.8; // 20% D
    }
    else if (cantidadRestante > 5 ){
        precioMangaActual = precioUnitario *0.9; // 10% D
    }
    else
    {   precioMangaActual = precioUnitario ;
    }
    // ------------------------------------------
    return precioMangaActual + calcularDescuentoRecursivoHelper ( cantidadRestante -1 , precioUnitario);
}
}
   
   
