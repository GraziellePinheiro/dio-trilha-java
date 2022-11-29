import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Olá, fui executado pelo terminal!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome : ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome : ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade : ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura : ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, eu me chamo " + nome + " " + sobrenome + " minha idade é " + idade + ", minha altura é " + altura);

    }
    
}
