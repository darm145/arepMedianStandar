package edu.escuelaing.arep;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MedianStandard 

{
    public static Nodo head;
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
    public static void insertar(int value){
        if (head==null){
            head= new Nodo(null,value);
        }
        else{
            Nodo temp= head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            Nodo nuevo=new Nodo(null,value);
            temp.setNext(nuevo);
        }
        System.out.println("valor insertado");
    }
    public static void verDatos(){
        Nodo actual=head;
        while(actual!=null){
            System.out.print(actual.value()+" ");
            actual=actual.getNext();
        }
        System.out.println();
    }
    public static void eliminar(int value){
        boolean eliminado=false;
        if(head!=null){
            if(head.value()==value){
                head=head.getNext();
                eliminado=true;
            }
            else{
                Nodo actual= head.getNext();
                Nodo anterior=head;
                while(actual !=null){
                    if(actual.value()==value){
                        anterior.setNext(actual.getNext());
                        eliminado =true;
                        break;
                    }
                actual=actual.getNext();
                anterior=anterior.getNext();
                }
            }
        }
        if (eliminado){
            System.out.println("elemento eliminado");
        }
        else{
            System.out.println("no se encontro el elemento");
        }
    }
    public static float media(){
        float valores=0;
        float sumatoria=0;
        Nodo actual=head;
        while (actual!=null){
            valores+=1;
            sumatoria+=actual.value();
            actual=actual.getNext();
        }
        float resultado=sumatoria/valores;
        return resultado;
    }
    public static double desviacion(){
        double media=media();
        double sumatoria=0;
        Nodo actual=head;
        double valores=-1;
        while (actual!=null){
            valores+=1;
            sumatoria+=(actual.value()-media)*(actual.value()-media);
            actual=actual.getNext();
        }
        
        return Math.sqrt(sumatoria/valores);
    }
}
