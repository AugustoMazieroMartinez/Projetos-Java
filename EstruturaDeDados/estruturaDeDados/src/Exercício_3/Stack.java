package Exercício_3;
import java.util.EmptyStackException;
public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public void realizarOperacao(String operador) {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int segundoNumero = pop();
        int primeiroNumero = pop();

        switch (operador) {
            case "+":
                push(primeiroNumero + segundoNumero);
                break;
            case "-":
                push(primeiroNumero - segundoNumero);
                break;
            case "*":
                push(primeiroNumero * segundoNumero);
                break;
            case "/":
                push(primeiroNumero / segundoNumero);
                break;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
