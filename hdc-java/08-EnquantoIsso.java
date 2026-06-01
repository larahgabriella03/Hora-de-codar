import java.util.Scanner;

public class Ex08_EnquantoIsso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor = 0;

        // O segundo valor não pode ser zero nem negativo
        while (segundoValor <= 0) {
            System.out.print("Informe o segundo valor (deve ser maior que zero): ");
            segundoValor = scanner.nextDouble();

            if (segundoValor <= 0) {
                System.out.println("Valor inválido! Informe um valor positivo.");
            }
        }

        double resultado = primeiroValor / segundoValor;

        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}
