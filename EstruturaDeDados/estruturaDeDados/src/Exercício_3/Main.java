package Exercício_3;

import java.util.Scanner;

public class Main {
    public static int avaliarExpressaoPosfixa(String[] expressao) {
        Stack pilha = new Stack();

        for (String token : expressao) {
            if (token.matches("-?\\d+")) {
                pilha.push(Integer.parseInt(token));
            } else {
                pilha.realizarOperacao(token);
            }
        }

        return pilha.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expressão em notação pós-fixa (separe os elementos por espaços): ");
        String expressaoInput = scanner.nextLine();

        // Dividir a entrada em tokens usando espaços como delimitadores
        String[] expressao = expressaoInput.split("\\s+");

        int resultado = avaliarExpressaoPosfixa(expressao);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
