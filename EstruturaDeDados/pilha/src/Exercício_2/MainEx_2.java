package Exercício_2;
import java.util.Scanner;
public class MainEx_2 {
    public static void main(String[] args) {
        stack stack = new stack();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma String para se Invertida: ");
        String input = ler.nextLine();
        System.out.println(stack.inverteString(input));
        ler.close();
    }
    
}
