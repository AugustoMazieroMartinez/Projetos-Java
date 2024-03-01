import java.util.Scanner;
public class Exercício_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = ler.nextLine();
        System.out.println(limpaString(str));
        System.out.println(isPalindromo(limpaString(str)));
        ler.close();
    }
    public static String limpaString(String str){
        String strLimpo = str.replaceAll("[ ,.;]", "").toLowerCase();
        return strLimpo;
    }
    public static boolean isPalindromo(String str){
        if(str.length() <= 1){
            return true;
        }
        else{
            char pLetra = str.charAt(0);
            char uLetra = str.charAt(str.length() - 1);
            
            if(pLetra == uLetra){
                String nString = str.substring(1, str.length() - 1);
                return isPalindromo(nString);
            }
            else{
                return false;
            }
        }
    }
}
