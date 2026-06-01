import java.util.Scanner;

public class Ex09_CansarDeDigitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double[] valores = new double[10];

        // Lendo os 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
            soma = soma + valores[i];
        }

        // Exibindo os números informados
        System.out.print("Números informados: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(valores[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }

        System.out.println();

        // Calculando e exibindo a média
        double media = soma / 10;
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}
