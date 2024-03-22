package Exercicio_1;

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
    public void push(char dado){
        Node newNode = new Node(dado);
        if(isEmpty()){
            first = newNode;
        }
        else{
            last.next = newNode;
        }
        last = newNode;
    }
    public char pop(){
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
    public char peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.value;
    }
    public String inversor(Fila fila){
        if(fila.isEmpty()){
            return "";
        }
        else{
            char retorno = fila.pop();
            return inversor(fila) + retorno;
        }
    }
    public String inverteString(String dado){
        Fila fila = new Fila();
        String novaString = "";
        for(char ch : dado.toCharArray()){
            fila.push(ch);
        }
        novaString = inversor(fila);
        return novaString;
    }
}