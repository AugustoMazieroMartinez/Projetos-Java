package Exercicio_3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fila fila = new Fila();
        System.out.println("Digite um Número par para o Tamanho da fila: ");
        int input = ler.nextInt();
        System.out.println("A fila Intercalada será: " + fila.intercalaFila(input));
        ler.close();
    }
}
