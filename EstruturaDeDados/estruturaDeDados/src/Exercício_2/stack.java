package Exercício_2;
import java.util.EmptyStackException;
public class stack {
    private node top;

    public stack(){
        this.top = null;
    }
    public void push(char dado){
        node newNode = new node(dado);
        newNode.next = top;
        top = newNode;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public char pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        char removeNode = top.value;
        top = top.next;
        return removeNode;
    }
    public char peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.value;
    }
    public String inverteString(String dado){
        stack stack = new stack();
        String novaString = "";
        for(char ch : dado.toCharArray()){
            stack.push(ch);
        }
        do{
            novaString += stack.pop();
        }while(!stack.isEmpty());
        return novaString;
    }
}
