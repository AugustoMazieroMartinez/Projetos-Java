import java.util.Scanner;

public class Exercício_1 {
        public static void main(String[] args) {
        int numero = numero();
        int resultado = somatoria(numero);
        System.out.println("A somatória dos numeros de 1 a " + numero + " é igual á: " + resultado);
    }

    public static int numero() {
        Scanner ler = new Scanner(System.in);
        boolean verifica = false;
        int n;
        do {
            System.out.println("Digite um número inteiro maior que zero: ");
            n = Integer.parseInt(ler.nextLine());

            if (n <= 0) {
                System.out.println("Por favor digite um numero positivo e maior que zero!!!");
            }
            else{
                verifica = true;
            }
        } while (verifica == false);
        ler.close();
        return n;
    }
    
    public static int somatoria(int x){
        if(x <= 1){
            return 1;
        }
        else{
            return x + somatoria(x - 1);
        }
    }
}
