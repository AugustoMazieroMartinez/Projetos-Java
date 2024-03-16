package Exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fila line = new Fila();
        System.out.println("Digite a String a ser Invertida: ");
        String input = ler.nextLine();
        System.out.println(line.inverteString(input));
        ler.close();
    }
}
