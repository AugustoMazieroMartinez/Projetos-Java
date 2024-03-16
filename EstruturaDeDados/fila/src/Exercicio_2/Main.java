package Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fila fila = new Fila();

        System.out.println("Digite a Posição dos Números em Binário que Deseja: ");
        int input = ler.nextInt();
        String[] numerosBinarios = fila.gerarNumerosBinarios(input);

        System.out.printf("Os Primeiros %d Números Binários são: ", input);
        for(String numero : numerosBinarios){
            System.out.print(numero + " ");
        }
        ler.close();
    }
}
