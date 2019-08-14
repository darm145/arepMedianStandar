package edu.escuelaing.arep;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 *
 */
public class MedianStandard 

{
    private static LinkedList elementos;
    public static void main( String[] args )
    {

        int value;
        elementos = new LinkedList();
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
                    System.out.println("digite el numero de valores que desea insertar");
                    int nrovalores=sc.nextInt();
                    for(int i=0;i<nrovalores;i++){
                        insertar(sc.nextInt());
                    }
                    break;
                case 2:
                    System.out.println("eliminar valor");
                    eliminar(sc.nextInt());
                    break;
                case 3:
                    System.out.println("media");
                    System.out.println(media());
                    break;
                case 4:
                    System.out.println("desviacion estandar ");
                    System.out.println(desviacion());
                    break;
                case 5:
                    System.out.println("valores ");
                    verDatos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }while(value!=6);
        sc.close();
    }
    
    private static void verDatos() {
        elementos.verDatos();
    }

    private static void eliminar(int value) {
        elementos.eliminar(value);
    }

    private static void insertar(int value) {
        elementos.insertar(value);
    }

    public static float media() {
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
    public static String desviacion(){
        double media=media();
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
