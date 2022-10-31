package bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int[]arreglo;
        int numElementos;
        int aux;
        
        System.out.println("Ingresa la cantidad de elementos del arreglo");
        numElementos = Integer.parseInt(bf.readLine());
        arreglo = new int[numElementos];
        
        // Pedir longitud del arreglo
        for (int i = 0; i < numElementos; i++) {
            System.out.println((i + 1) + " . - Ingresa un número: ");
            arreglo[i] = Integer.parseInt(bf.readLine());
        }
        
        //Ordenar el arreglo
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        
        // Imprimir arreglo
        System.out.println("Este es el arreglo ordenado: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        } 
    }
}
