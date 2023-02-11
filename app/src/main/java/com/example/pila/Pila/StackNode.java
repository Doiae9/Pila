package com.example.pila.Pila;

public class StackNode {
    private int data;
    private StackNode next;

    public StackNode(int data, StackNode next){
        this.data= data;
        this.next= next;
    }
    public String toString(){
        return String.valueOf(data);
    } //Extraemos el dato de data
    public StackNode getNext(){
        return next;
    }
    public int getData(){
        return data;
    }

}
