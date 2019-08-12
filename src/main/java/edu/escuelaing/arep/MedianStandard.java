package edu.escuelaing.arep;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MedianStandard 
{
    public static void main( String[] args )
    {
        int value;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Calculadora de media y desviación estandar");
            System.out.println("Seleccione una opción");
            System.out.println("1. insertar un nuevo valor");
            System.out.println("2. eliminar un valor");
            System.out.println("3. calcular media");
            System.out.println("4. calcular desviación estandar");
            System.out.println("5. mostrar los valores actuales");
            System.out.println("6. finalizar");
            value=sc.nextInt();
            switch(value){
                case 1:
                    System.out.println("insertar valor");
                    break;
                case 2:
                    System.out.println("eliminar valor");
                    break;
                case 3:
                    System.out.println("media");
                    break;
                case 4:
                    System.out.println("desviacion estandar ");
                    break;
                case 5:
                    System.out.println("valores ");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }while(value!=6);
        sc.close();
    }
}
