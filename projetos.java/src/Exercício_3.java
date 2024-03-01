import java.util.Scanner;
public class Exercício_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a posição que deseja da sequencia fibonacci: ");
        int n = ler.nextInt();
        int fib = fibonacci(n);
        System.out.println("O número da sequencia fibonacci de posição " + n + " é: " + fib);
        ler.close();
    }
    public static int fibonacci(int x){
        if(x <= 1){
            return x;
        }
        else{
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}
