package com.example.pila.Pila;

import android.util.Log;

public class PilaArreglo {
    private static final int size = 10;
    private int[] list;
    private int top;

    public PilaArreglo() { //Aquí se inicializa la pila
        list = new int[size];
        top = -1;
    }

    public int getTop() {
        return top;
    }//Si se añaden mas elementos de los debidos se hace un stack overflow

    public void push(int data) { //Al añadir datos a la lista se suma el dato de la pila
        //Tiene un Big O constante
        if(isFull()==true)
            Log.i("log","Stack is full");
       else {top++;
        list[top] = data;
    }}

    public int pop() {//Al quitar datos de la lista o pila se resta el dato de la pila
        //Si se borran mas datos de los necesarios se crea un underflow
        //Big O constante
        int aux=-1;
        if(isEmpty()==true)
            Log.i("log","Stack is empty");
        else {
            aux = list[top];
            list[top] = -1;
            top--;
        }
            return aux;

    }

    public int getDataTop() {
        return list[top];
    }


    public boolean isFull() {
        boolean flag = false;
        if (top == size - 1)
            return true;
        return flag;
    }
    public boolean isEmpty(){
        boolean flag= false;
        if(top ==-1)
            return true;
        return flag;
    }
}

    /*public boolean isFull(){
        // return top == size -1 ? true : false;
        if(top== size-1)
            return true;
        return false;
    }
 */
