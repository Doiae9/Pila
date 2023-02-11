package com.example.pila;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.pila.Pila.PilaArreglo;
import com.example.pila.Pila.Stack;

public class MainActivity extends AppCompatActivity {
private Stack stack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stack= new Stack();
        stack.push(20);
        stack.push(11);
        stack.push(34);
        stack.push(2);
        Log.i("log","el top es"+stack.getTop());
        Log.i("log","el top es"+stack.pop());
        Log.i("log","Removed ->"+stack.pop());
        stack.print();

       /* stack = new PilaArreglo();
        //Se añaden los datos de la pila con el push
        stack.push(3);
        stack.push(5);
        stack.push(9);
        Log.i("log","Top ->"+stack.getTop());
        stack.push(6);
        stack.push(19);
        stack.push(10);
        Log.i("log",stack.pop()+"");
        Log.i("log","Top ->"+stack.getTop()+"Data->"+stack.getDataTop());
    }*/

}}