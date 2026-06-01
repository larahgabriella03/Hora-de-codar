import java.util.Scanner;

public class Ex14_PassouNoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprovados = 0;
        String resposta = "S";

        // Repetindo enquanto o usuário quiser
        while (resposta.equalsIgnoreCase("S")) {
            double soma = 0;

            // Lendo as 6 notas
            for (int i = 1; i <= 6; i++) {
                System.out.print("Informe a nota " + i + ": ");
                double nota = scanner.nextDouble();
                soma = soma + nota;
            }

            double media = soma / 6;
            System.out.println("Média final: " + media);

            if (media >= 6.5) {
                System.out.println("Aluno APROVADO!");
                aprovados++;
            } else {
                System.out.println("Aluno REPROVADO.");
            }

            System.out.print("Calcular a média de outro aluno? Sim/Não (S/N): ");
            resposta = scanner.next();
        }

        System.out.println("Total de alunos aprovados: " + aprovados);

        scanner.close();
    }
}
