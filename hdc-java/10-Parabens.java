import java.util.Scanner;

public class Ex10_Parabens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        // Lendo as 4 notas
        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma = soma + nota;
        }

        double media = soma / 4;

        System.out.println("Média do semestre: " + media);

        // Verificando se o aluno foi aprovado
        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        }

        scanner.close();
    }
}
