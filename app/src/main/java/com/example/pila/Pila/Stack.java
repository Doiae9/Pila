package com.example.pila.Pila;

import android.util.Log;

public class Stack {
    private StackNode top;

    public Stack( ) {
        top = null;
    }
    public StackNode getTop(){
        return top;
    }
    public void push(int data ){
        top = new StackNode(data, top);
        if(top == null){
            Log.i("log","StackOverflow");
        }
    }
    public int pop(){
        if(top==null){//Aquí revisa que ya no existen mas objetos del tipo StackNode
            Log.i("log","Empty Stack");
            return -1;
        }
    StackNode aux = top;
    top= top.getNext();
    return aux.getData();
    }
    public void print(){
        String aux="";
        StackNode node= top;
        while(node != null){
            aux+= node +"->";
            node= node.getNext();
        }
        Log.i("log",aux);
    }


}
