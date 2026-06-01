import java.util.Scanner;

public class Ex13_DeQuantoAteQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número (menor): ");
        int primeiro = scanner.nextInt();

        System.out.print("Informe o segundo número (maior): ");
        int segundo = scanner.nextInt();

        double soma = 0;
        int quantidade = 0;

        // Somando todos os números entre os dois valores (inclusive)
        for (int i = primeiro; i <= segundo; i++) {
            soma = soma + i;
            quantidade++;
        }

        double media = soma / quantidade;

        System.out.println("Média aritmética dos números de " + primeiro + " até " + segundo + ": " + media);

        scanner.close();
    }
}
