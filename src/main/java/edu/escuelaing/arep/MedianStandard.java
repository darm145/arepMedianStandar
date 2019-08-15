package edu.escuelaing.arep;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * implementacion de un programa que permite calcular media y desviacion estandar de ciertos datos.
 *@author David Ramirez
 */
public class MedianStandard 

{
    
    public static void main( String[] args )
    {

        int value;
        LinkedList elementos = new LinkedList();
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Calculadora de media y desviación estandar");
            System.out.println("Seleccione una opción");
            System.out.println("1. insertar nuevos valores");
            System.out.println("2. eliminar un valor");
            System.out.println("3. calcular media");
            System.out.println("4. calcular desviación estandar");
            System.out.println("5. mostrar los valores actuales");
            System.out.println("6. finalizar");
            value=sc.nextInt();
            switch(value){
                case 1:
                    System.out.println("digite el numero de valores a insertar");
                    int nrovalores=sc.nextInt();
                    System.out.println("digite los valores");
                    for(int i=0;i<nrovalores;i++){
                        insertar(sc.nextInt(),elementos);
                    }
                    break;
                case 2:
                    System.out.println("eliminar valor");
                    eliminar(sc.nextInt(),elementos);
                    break;
                case 3:
                    System.out.println("media");
                    System.out.println(media(elementos));
                    break;
                case 4:
                    System.out.println("desviacion estandar ");
                    System.out.println(desviacion(elementos));
                    break;
                case 5:
                    System.out.println("valores ");
                    verDatos(elementos);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }while(value!=6);
        sc.close();
    }
    /**
     * permite ver los datos actualmente almacenados.
     *  @param elementos linked list con los elementos
     */
    private static void verDatos(LinkedList elementos) {
        elementos.verDatos();
    }
    /**
     * permite eliminar un dato de la linked list
     * @param value el dato a eliminar 
     *  @param elementos linked list con los elementos
     */
    private static void eliminar(float value,LinkedList elementos) {
        elementos.eliminar(value);
    }
    /**
     * permite insertar un dato de la linked list
     * @param value el dato a insertar
     *  @param elementos linked list con los elementos
     */

    private static void insertar(float value,LinkedList elementos) {
        elementos.insertar(value);
    }
    /**
     * metodo para calcular la media de los elementos
     * @param elementos linked list con los elementos
     * @return el valor de la media para los elementos recibidos
     */
    public static float media(LinkedList elementos) {
        float valores=0;
        float sumatoria=0;
        Nodo actual=elementos.getHead();
        while (actual!=null){
            valores+=1;
            sumatoria+=actual.value();
            actual=actual.getNext();
        }
        float resultado=sumatoria/valores;
        return resultado;
    }
    /**
     * permite calcular la desviacion estandar de los datos ingresados
     *  @param elementos linked list con los elementos
     * @return el valor de la desviacion estandar de los datos ingresados
     */
    public static String desviacion(LinkedList elementos){
        double media=media(elementos);
        double sumatoria=0;
        Nodo actual=elementos.getHead();
        double valores=-1;
        DecimalFormat df= new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        
        while (actual!=null){
            valores+=1;
            sumatoria+=(actual.value()-media)*(actual.value()-media);
            actual=actual.getNext();
        }
        
        return df.format(Math.sqrt(sumatoria/valores));
    }
}
