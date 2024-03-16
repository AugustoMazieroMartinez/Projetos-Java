package Exercicio_2;

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
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.value;
    }
    public String[] gerarNumerosBinarios(int valor){
        String[] resultado = new String[valor];
        Fila fila = new Fila();

        fila.push('1');

        for(int i = 0; i < valor; i++){
            int numero = fila.pop();
            resultado[i] = Integer.toBinaryString(numero);

            fila.push(numero * 2);
            fila.push(numero * 2 + 1);
        }
        return resultado;
    }
}
