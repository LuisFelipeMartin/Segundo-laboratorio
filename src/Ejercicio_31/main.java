package Ejercicio_31;
import java.util.Scanner;         
public class main 
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);  
        System.out.println("CALCULADORA DE MATRICES");
        System.out.println("Matriz 1:");
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        Matrices matriz1=new Matrices(filas,columnas);
        matriz1.llenarMatriz();
        matriz1.imprimirMatriz();
        int menu=0;
        //menu
        System.out.println("1. Suma de matrices");
        System.out.println("2.Multiplicacion de matrices");
        System.out.println("3. Matriz por un escalar");
        System.out.println("4. Transpuesta de una matriz");
        do
        {
            System.out.println("Ingrese opcion (0 para Salir):");
            menu= scanner.nextInt();  
            switch (menu)
            {
            case 1:
                Matrices matriz2= new Matrices (filas, columnas);
                matriz2.llenarMatriz();
                System.out.println("La suma de las matrices son:");
                Matrices resultadosum= Matrices.sumarMatriz (matriz1, matriz2); 
                resultadosum.imprimirMatriz(); //llamado
            break;
            case 2: 
                System.out.println("Ingrese numero de filas para la segunda matriz:");
                int filas2=scanner.nextInt();
                System.out.println("Ingrese numero de columnas para la segunda matriz:");
                int columnas2=scanner.nextInt();
                System.out.println( "El resultado de la multiplicacion es:");
                if (filas2==columnas)
                {
                    matriz2=new Matrices (filas2, columnas2);
                    matriz2.llenarMatriz();
                    Matrices resultado= Matrices.multilplicarMatriz(matriz1, matriz2);
                    resultado.imprimirMatriz();
                }
                else
                    System.out.println("Matrices no compatibles");
            break;
            case 3:
                System.out.println("Ingrese el escalar con que desea multiplicar la matriz:");
                int escalar=scanner.nextInt();
                System.out.println("El resultado de la matriz por el escalar ("+escalar+") es: ");
                Matrices resultadoesc= Matrices.escalarMatriz(matriz1,escalar);
                resultadoesc.imprimirMatriz();
            break;
            case 4:
                System.out.println("La transpuesta de la matriz es:");
                Matrices resultadotrans= Matrices.transpuestaMatriz(matriz1);
                resultadotrans.imprimirMatriz();
            break;  
            case 0:
                System.exit(0);
            break;
            }
        }while(menu !=0);
    }   
}
