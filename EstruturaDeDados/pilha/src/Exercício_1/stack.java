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
    public static boolean verificaString(String input) {
        for (char ch : input.toCharArray()) {
            if (ch != '(' && ch != ')') {
                return false;
            }
        }
        return true;
    }
    public boolean isBalanced(String input){
        if(!verificaString(input)){
            return false;
        }
        stack stack = new stack();

        for(char ch : input.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
