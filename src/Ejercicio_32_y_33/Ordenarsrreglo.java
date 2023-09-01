package Ejercicio_32_y_33;




import java.util.Arrays;

public class Ordenarsrreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamanoArreglo100 = 100;
        int tamanoArreglo500 = 500;
        int tamanoArreglo1000 = 1000;
        int tamanoArreglo5000 = 5000;
        int tamanoArreglo10000 = 10000;

        double[] arreglo100 = Ordenar.generarArregloAleatorio(tamanoArreglo100);
        double[] arreglo500 = Ordenar.generarArregloAleatorio(tamanoArreglo500);
        double[] arreglo1000 = Ordenar.generarArregloAleatorio(tamanoArreglo1000);
        double[] arreglo5000 = Ordenar.generarArregloAleatorio(tamanoArreglo5000);
        double[] arreglo10000 = Ordenar.generarArregloAleatorio(tamanoArreglo10000);

        //burbuja
        Ordenar.burbuja(arreglo100);
        Ordenar.burbuja(arreglo500);
        Ordenar.burbuja(arreglo1000);
        Ordenar.burbuja(arreglo5000);
        Ordenar.burbuja(arreglo10000);

        System.out.println("Arreglo ordenado utilizando el método de burbuja:");
        System.out.println(" 100    \t| 500     \t| 1000     \t| 5000|     \t| 10000 ");
        Ordenar.imprimirBur(arreglo100);
        Ordenar.imprimirBur(arreglo500);
        Ordenar.imprimirBur(arreglo1000);
        Ordenar.imprimirBur(arreglo5000);
        Ordenar.imprimirBur(arreglo10000);
        
        //insercion
        Ordenar.insercion(arreglo100);
        Ordenar.insercion(arreglo500);
        Ordenar.insercion(arreglo1000);
        Ordenar.insercion(arreglo5000);
        Ordenar.insercion(arreglo10000);

        System.out.println("\n\nArreglo ordenado utilizando el método de insercion:");
        System.out.println(" 100    \t| 500     \t| 1000     \t| 5000|     \t| 10000 ");
        Ordenar.imprimirins(arreglo100);
        Ordenar.imprimirins(arreglo500);
        Ordenar.imprimirins(arreglo1000);
        Ordenar.imprimirins(arreglo5000);
        Ordenar.imprimirins(arreglo10000);
        
        //seleccion
        Ordenar.seleccion(arreglo100);
        Ordenar.seleccion(arreglo500);
        Ordenar.seleccion(arreglo1000);
        Ordenar.seleccion(arreglo5000);
        Ordenar.seleccion(arreglo10000);

        System.out.println("\n\nArreglo ordenado utilizando el método de insercion:");
        System.out.println(" 100    \t| 500     \t| 1000     \t| 5000|     \t| 10000 ");
        Ordenar.imprimirselec(arreglo100);
        Ordenar.imprimirselec(arreglo500);
        Ordenar.imprimirselec(arreglo1000);
        Ordenar.imprimirselec(arreglo5000);
        Ordenar.imprimirselec(arreglo10000);
        
        //seleccion
        Ordenar.mergesort(arreglo100);
        Ordenar.mergesort(arreglo500);
        Ordenar.mergesort(arreglo1000);
        Ordenar.mergesort(arreglo5000);
        Ordenar.mergesort(arreglo10000);

        System.out.println("\n\nArreglo ordenado utilizando el método de insercion:");
        System.out.println(" 100    \t| 500     \t| 1000     \t| 5000|     \t| 10000 ");
        Ordenar.imprimirmergesort(arreglo100);
        Ordenar.imprimirmergesort(arreglo500);
        Ordenar.imprimirmergesort(arreglo1000);
        Ordenar.imprimirmergesort(arreglo5000);
        Ordenar.imprimirmergesort(arreglo10000);
        
        
        
        
    }
    
}
