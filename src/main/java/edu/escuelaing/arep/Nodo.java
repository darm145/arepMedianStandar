package edu.escuelaing.arep;

public class Nodo{
    private Nodo next;
    private int value;
    public Nodo(Nodo next,int value){
        this.next=next;
        this.value=value;
    }
    public Nodo getNext(){
        return next;
    }
    public int value(){
        return value;
    }
}