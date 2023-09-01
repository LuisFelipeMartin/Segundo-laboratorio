package Ejercicio_32_y_33;
import java.util.Arrays;
public class Ordenar 
{

    public static double[] generarArregloAleatorio(int n)
    {
        double[] arreglo = new double[n];
        for (int i = 0; i < n; i++) 
        {
            arreglo[i] = Math.random();
        }
        return arreglo;
    }
    public static void burbuja(double[] arreglo)
    {
        int n = arreglo.length;
        double temp = 0;
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-1-i; j++) 
            {
                if (arreglo[j] > arreglo[j+1]) 
                {        
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }
    
    public static void insercion(double[] arreglo) {
        int n = arreglo.length;
        double temp = 0;
        for (int i = 1; i < n; i++) {
            temp = arreglo[i];
            int j = i-1;
            while (j >= 0 && arreglo[j] > temp) {
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j+1] = temp;
        }
    }
    
    public static void seleccion(double[] arreglo) {
        int n = arreglo.length;
        double temp = 0;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
            }
            temp = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = temp;
        }
    }
    
    public static void mergesort(double[] arreglo) {
        if (arreglo.length > 1) {
            int mid = arreglo.length/2;
            double[] leftArray = Arrays.copyOfRange(arreglo, 0, mid);
            double[] rightArray = Arrays.copyOfRange(arreglo, mid, arreglo.length);
            mergesort(leftArray);
            mergesort(rightArray);
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] < rightArray[j]) {
                    arreglo[k] = leftArray[i];
                    i++;
                } else {
                    arreglo[k] = rightArray[j];
                    j++;
                }
                k++;
            }
            while (i < leftArray.length) {
                arreglo[k] = leftArray[i];
                i++;
                k++;
            }
            while (j < rightArray.length) {
                arreglo[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }
    
    public static void imprimirBur(double[] arreglo){
        long startTime = System.nanoTime();

        burbuja(arreglo);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.print( duration + " ns \t | ");
        
    }
    
    public static void imprimirins(double[] arreglo){
        long startTime = System.nanoTime();

        insercion(arreglo);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.print( duration + " ns \t | ");
        
    }
    
    public static void imprimirselec(double[] arreglo){
        long startTime = System.nanoTime();

        seleccion(arreglo);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.print( duration + " ns \t | ");
        
    }
    
    public static void imprimirmergesort(double[] arreglo){
        long startTime = System.nanoTime();

        mergesort(arreglo);

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.print( duration + " ns \t | ");
        
    }
    
}
