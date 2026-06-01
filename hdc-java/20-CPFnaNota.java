import java.util.Scanner;

public class Ex20_CPFnaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço unitário: R$ ");
        double precoUnitario = scanner.nextDouble();

        // Calculando o valor da venda
        double valorVenda = quantidade * precoUnitario;

        // Determinando o percentual de desconto
        double percentualDesconto = 0;

        if (quantidade <= 5) {
            percentualDesconto = 0.02; // 2%
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03; // 3%
        } else {
            percentualDesconto = 0.05; // 5%
        }

        double valorDesconto = valorVenda * percentualDesconto;
        double imposto = valorVenda * 0.20; // 20% de imposto fixo
        double totalAPagar = valorVenda - valorDesconto;

        // Exibindo o recibo como uma nota fiscal
        System.out.println("\n========================================");
        System.out.println("             NOTA FISCAL                ");
        System.out.println("========================================");
        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", percentualDesconto * 100, valorDesconto);
        System.out.printf("Imposto fixo (20%%): R$ %.2f%n", imposto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalAPagar);
        System.out.println("========================================");

        scanner.close();
    }
}
