package Ejercicio_31;
import java.util.Scanner;
public class Matrices 
{
    public int filas;
    public int columnas;
    public int [][]matriz;
    public Matrices(int filas, int columnas)
    {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }
    public void llenarMatriz ()
    {
        Scanner scanner= new Scanner (System.in);
        for (int i=0;i<filas; i++)
        {
            for (int j=0; j<columnas; j++)
            {
                System.out.println("Ingrese la posicion ["+i+"] ["+j+"]");
                matriz [i][j]=scanner.nextInt();
            }
        }
    }
    public static Matrices sumarMatriz(Matrices matriz1, Matrices matriz2)
    {
        int filas= matriz1.filas;
        int columnas= matriz1.columnas;
        Matrices resultado= new Matrices (filas, columnas);
        for(int i=0; i<filas; i++)
        {
            for(int j=0; j<columnas;j++)
            {
                resultado.matriz[i][j]=matriz1.matriz[i][j]+ matriz2.matriz[i][j];
            }
        }
        return resultado;
    }
    public static Matrices multilplicarMatriz (Matrices matriz1, Matrices matriz2)
    {
        int filas1= matriz1.filas;
        int columnas1=matriz1.columnas;
        int columnas2=matriz2.columnas;
        Matrices resultado = new Matrices(filas1, columnas2);
        for (int i=0;i<filas1;i++)
        {
            for (int k=0;k<columnas1;k++)
            {
                for (int j=0;j<columnas2;j++)
                {
                    resultado.matriz[i][j]= resultado.matriz[i][j] + (matriz1.matriz[i][k]*matriz2.matriz[k][j]);
                }
            }
        }
        return resultado;
    }
    public static Matrices escalarMatriz (Matrices matriz1, int escalar)
    {
        int columnas= matriz1.columnas;
        int filas= matriz1.filas;
        Matrices resultado= new Matrices(filas, columnas );
        for (int i=0;i<filas;i++)
        {
            for ( int j=0;j<columnas; j++)
            {
                resultado.matriz[i][j]=matriz1.matriz[i][j]* escalar;
            }
        }
        return resultado;
    }
    public static Matrices transpuestaMatriz(Matrices matriz1)
    {
        int columnas= matriz1.filas;
        int filas=matriz1.columnas;
        Matrices resultado = new Matrices(columnas, filas);
        for (int i=0;i<columnas;i++)
        {
            for ( int j=0;j<filas; j++)
            {
                resultado.matriz[i][j]=matriz1.matriz[j][i];
            }
        }
        return resultado;
    }   
    public void imprimirMatriz ()
    {
        for (int i=0;i<filas;i++)
        {
            for (int j=0;j<columnas;j++)
            {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
    }
    public void imprimirMatrizmul(Matrices matriz2, Matrices matriz1 )
    {
        int filas=matriz1.filas;
        int columnas=matriz2.columnas ;
        for (int i=0;i<filas;i++)
        {
            for (int j=0;j<columnas;i++)
            {
                System.out.print("\t"+ matriz[i][j]);
            }
            System.out.println();
        }   
    }
}

    