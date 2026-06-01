import java.util.Scanner;

public class Ex18_APagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioFixo = 5000.00;

        System.out.print("Informe o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Informe o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Informe a comissão fixa por carro vendido: R$ ");
        double comissaoPorCarro = scanner.nextDouble();

        // Calculando as partes do salário
        double comissaoTotal = comissaoPorCarro * carrosVendidos;
        double percentualVendas = valorTotalVendas * 0.05;

        double salarioFinal = salarioFixo + comissaoTotal + percentualVendas;

        System.out.println("\n--- Detalhamento do salário ---");
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Carros vendidos: %d%n", carrosVendidos);
        System.out.printf("Comissão por carro (R$ %.2f x %d): R$ %.2f%n", comissaoPorCarro, carrosVendidos, comissaoTotal);
        System.out.printf("Valor total das vendas: R$ %.2f%n", valorTotalVendas);
        System.out.printf("5%% sobre as vendas: R$ %.2f%n", percentualVendas);
        System.out.printf("Salário final: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
