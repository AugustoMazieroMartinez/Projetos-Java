package Exercicio_3;

import java.util.EmptyStackException;

public class Fila {
    private Node first;
    private Node last;

    public Fila(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(int dado){
        Node newNode = new Node(dado);
        if(isEmpty()){
            first = newNode;
        }
        else{
            last.next = newNode;
        }
        last = newNode;
    }
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Node removedNode = this.first;
        first = first.next;
        if(first == null){
            last = null;
        }
        return removedNode.value;
    }
    public Node peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.first;
    }
    public String intercalaFila(int a){
        Fila fila1 = new Fila();
        Fila fila2 = new Fila();
        Fila fila3 = new Fila();
        int b = a / 2;
        String valor = "";
        for(int i = 1; i <= a; i++){
            fila1.push(i);
        }
        for(int i = 1; i <= b; i++){
            fila2.push(fila1.pop());
        }
        while(!fila1.isEmpty() && !fila2.isEmpty()){
            fila3.push(fila2.pop());
            fila3.push(fila1.pop());
        }
        while(!fila3.isEmpty()){
            valor += fila3.pop();
        }
        return valor;
    }
}
