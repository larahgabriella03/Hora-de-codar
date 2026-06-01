import java.util.Scanner;

public class Ex17_CustaQuanto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: R$ ");
        double custoFabrica = scanner.nextDouble();

        // Distribuidor: 28% sobre o custo de fábrica
        double percentualDistribuidor = 0.28;

        // Impostos: 45% sobre o custo de fábrica
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        System.out.println("\n--- Detalhamento do custo ---");
        System.out.printf("Custo de fábrica: R$ %.2f%n", custoFabrica);
        System.out.printf("Distribuidor (28%%): R$ %.2f%n", valorDistribuidor);
        System.out.printf("Impostos (45%%): R$ %.2f%n", valorImpostos);
        System.out.printf("Custo final ao consumidor: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
