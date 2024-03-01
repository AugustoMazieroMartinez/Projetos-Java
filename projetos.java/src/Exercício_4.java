import java.util.Scanner;
public class Exercício_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = ler.nextLine();
        System.out.println("Sua String ao Contrário é: " + inverterString(str, str.length() - 1));
        ler.close();
    }
    
    public static String inverterString(String str,int index) {
        if (index == 0) {
            return str.charAt(0) + "";
        } else {
            char letter = str.charAt(index);
            return letter + inverterString(str, index - 1);
        }
    }
}
