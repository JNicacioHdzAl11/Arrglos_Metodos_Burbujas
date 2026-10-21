/*
 * Indica la ubicación del archivo dentro del proyecto
 * e importa la herramienta para imprimir listas en pantalla.
 */
package com.uthh.edd.unidad1.arreglos;
import java.util.Arrays;

/**
 * Programa para comparar dos formas de ordenar una lista de números.
 */
public class Arreglos { 
    
    /*
     * Método 1: Burbuja Tradicional.
     * Revisa la lista varias veces, comparando números juntos
     * y cambiándolos de lugar si el primero es más grande que el segundo.
     */
    public static void ordenamientoBurbuja(int[] arreglo) {  
        // Repite el proceso varias veces según el tamaño de la lista
        for (int pasada = 0; pasada < arreglo.length - 1; pasada++) {  
            // Compara cada par de números vecinos
            for (int i = 0; i < arreglo.length - 1 - pasada; i++) {  
                // Si el número actual es mayor que el siguiente, los intercambia
                if (arreglo[i] > arreglo[i+1]) {  
                    int aux = arreglo[i];        // Guarda el número para no perderlo
                    arreglo[i] = arreglo[i+1];  // Mueve el menor a la izquierda
                    arreglo[i+1] = aux;         // Mueve el mayor a la derecha
                }  
            }  
        }  
    }

    /*
     * Método 2: Burbuja Optimizado.
     * Hace lo mismo que el anterior, pero si se da cuenta de que
     * ya no necesita mover nada, se detiene para ahorrar trabajo.
     */
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {  
        for (int pasada = 0; pasada < arreglo.length - 1; pasada++) {  
            boolean hayIntercambio = false; // Avisa si se hizo algún cambio en esta vuelta
            
            for (int i = 0; i < arreglo.length - 1 - pasada; i++) {  
                if (arreglo[i] > arreglo[i+1]) {  
                    int aux = arreglo[i];  
                    arreglo[i] = arreglo[i+1];  
                    arreglo[i+1] = aux;  
                    hayIntercambio = true; // Confirma que sí hubo un cambio
                }  
            }  
            
            // Si en toda la vuelta no movió nada, significa que ya está listo y termina
            if (!hayIntercambio) {  
                break;  
            }  
        }  
    }

    /*
     * Parte principal: crea listas de prueba y muestra los resultados.
     */
    public static void main(String[] args) {  
        // Prepara dos listas: una revuelta y otra casi ordenada
        int[] desordenado = { 5, 2, 3, 1, 4 };  
        int[] parcial     = { 1, 2, 3, 5, 4 };

        // Muestra cómo están las listas al inicio
        System.out.println("Original: " + Arrays.toString(desordenado));  
        System.out.println("Parcial: " + Arrays.toString(parcial));  

        // Saca copias de la lista revuelta para probar ambos métodos sin arruinar la original
        int[] copiaDes1 = Arrays.copyOf(desordenado, desordenado.length);  
        ordenamientoBurbuja(copiaDes1);  
        int[] copiaDes2 = Arrays.copyOf(desordenado, desordenado.length);  
        ordenamientoBurbujaMejorado(copiaDes2);

        // Muestra la lista revuelta ya acomodada por ambos métodos
        System.out.println("Ordenada con copiaDes1: " + Arrays.toString(copiaDes1));  
        System.out.println("Ordenada con copiaDes2: " + Arrays.toString(copiaDes2));

        // Saca copias de la lista casi ordenada para hacer la misma prueba
        int[] copiaPar1 = Arrays.copyOf(parcial, parcial.length);  
        ordenamientoBurbuja(copiaPar1);  
        int[] copiaPar2 = Arrays.copyOf(parcial, parcial.length);  
        ordenamientoBurbujaMejorado(copiaPar2);  

        // Muestra el resultado final de la lista casi ordenada
        System.out.println("Ordenada con copiaPar1: " + Arrays.toString(copiaPar1));  
        System.out.println("Ordenada con copiaPar2: " + Arrays.toString(copiaPar2));
    }  
}