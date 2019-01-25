import java.io.*;
 
public class burbuja
{
    public static void main(String arg[]) throws IOException //throws IOException permite atrapar todas aquellas excepciones que tengamos en el	programa.
    {
        /*creacion del objeto para leer por teclado*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader stdin=newBufferedReader(newInputStreamReader(System.in)),	
//sedeclaraunavariablequepuedacapturartextodela	línea	de	comandos.
        /*ingreso del tamaño de arreglos*/
        System.out.print("\n Ingrese Numero de Datos a Ingresar : ");
        int tam = Integer.parseInt(in.readLine());
        /*creacion del arreglo*/
        int arr[] = new int[tam];
        System.out.println();
        /*lectura del arreglo*/
        int j = 0;
        for (int i = 0 ; i < arr.length;i++)
        {
            j+=1;
            System.out.print("Elemento " + j + " : ");
            arr[i] = Integer.parseInt(in.readLine()); //stdin.readLine() estecomando sirveparaleerel texto dela	línea de comandos y	
//poder	guardarlo	en	una	variable	de	tipo	String

        }
        burbuja(arr);
    }
 
    static void burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
    }
}

    

