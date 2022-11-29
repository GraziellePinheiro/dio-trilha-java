import java.util.Scanner;

public class While {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     String nome ;
    //     int idade;

    //     while(true){
    //         System.out.println("Digite seu nome: ");
    //         nome = scan.next();
    //         if(nome.equals("0")) break;

    //         System.out.println("Digite dsa idade: ");
    //         idade = scan.nextInt();
    //     }

    //     System.out.println("Saiu do loop!!!");

    // }

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int nota;


    //     System.out.println("Digite a nota: ");
    //     nota = scan.nextInt();

    //     while(nota < 0 | nota > 10){
    //         System.out.println("Nota invalida, digite outra nota por favor! ");
    //         nota = scan.nextInt();
    //     }

    //     System.out.println("Aqui encerra o programa! ");
    // }

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int count = 0;
    //     int  numero;
    //     int maior = 0;
    //     int menor = 0;
    //     int soma = 0;

    //     do{
    //         System.out.println("Numero: ");
    //         numero = scan.nextInt();

    //         soma = soma + numero;
    //         System.out.println("A soma ate agora é:" + soma);

    //         if(numero > maior) maior = numero;
    //         //if(numero < menor) menor = numero;

    //         count = count + 1;    
    //         System.out.println("Qual o maior numero: " + maior);       
    //     } while(count <= 5);

    //     //System.out.println("Qual o maior numero: " + maior);
    //     System.out.println("O menor numero é: " + menor);
    //     System.out.println("Media: " + (soma/5));

    // }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int quantNumeros;
        int quantPares = 0, quantImpares = 0;
        

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidades Impares: " + quantImpares);

        
    }
}
