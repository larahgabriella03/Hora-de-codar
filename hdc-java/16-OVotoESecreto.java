import java.util.Scanner;

public class Ex16_OVotoESecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o total de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Informe a quantidade de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Informe a quantidade de votos válidos: ");
        int votosValidos = scanner.nextInt();

        System.out.print("Informe a quantidade de votos nulos: ");
        int votosNulos = scanner.nextInt();

        // Calculando o percentual de cada categoria
        double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percentualValidos = (votosValidos * 100.0) / totalEleitores;
        double percentualNulos = (votosNulos * 100.0) / totalEleitores;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Votos brancos: %d (%.2f%%)%n", votosBrancos, percentualBrancos);
        System.out.printf("Votos válidos: %d (%.2f%%)%n", votosValidos, percentualValidos);
        System.out.printf("Votos nulos: %d (%.2f%%)%n", votosNulos, percentualNulos);

        scanner.close();
    }
}
