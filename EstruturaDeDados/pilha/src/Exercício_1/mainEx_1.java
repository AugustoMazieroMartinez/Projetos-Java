import java.util.Scanner;
public class mainEx_1 {
    public static void main(String[] args) {
        stack stack = new stack();
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva uma string contendo apenas parenteses: ");
        String input = ler.nextLine();
        System.out.println(stack.isBalanced(input));
        ler.close();
    }
}
