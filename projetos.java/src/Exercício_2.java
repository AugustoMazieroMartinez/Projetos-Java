import java.util.Scanner;

public class Exercício_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double n1 = ler.nextDouble();
        int n2 = verifica();
        double potencia = potencia(n1, n2);
        System.out.println("O número " + n1 + " elevado a " + n2 + " é igual a: " + potencia);
        ler.close();
    }

    public static int verifica() {
        Scanner ler = new Scanner(System.in);
        int n2;
        boolean isPositive = false;
        do {
            System.out.println("Digite a potencialização: ");
            n2 = ler.nextInt();
            if (n2 <= 0) {
                System.out.println("Digite um número positivo maior que 0!!!");
            } else {
                isPositive = true;
            }
        } while (isPositive == false);
        ler.close();
        return n2;
    }

    public static double potencia(double x, int y) {
        if (y <= 1) {
            return x;
        } else {
            return x * potencia(x, y - 1);
        }
    }
}
