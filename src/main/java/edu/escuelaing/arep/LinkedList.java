package edu.escuelaing.arep;

public class LinkedList{
    private static Nodo head;
    public LinkedList(){
        head=null;
    }
    public Nodo getHead(){
        return head;
    }
    public  void insertar(int value){
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
    public  void eliminar(int value){
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
    public  void verDatos(){
        Nodo actual=head;
        while(actual!=null){
            System.out.print(actual.value()+" ");
            actual=actual.getNext();
        }
        System.out.println();
    }
}