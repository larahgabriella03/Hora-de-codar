import java.util.Scanner;

public class Ex21_DescansoMerecido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do empregado: ");
        int codigo = scanner.nextInt();

        System.out.print("Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe o ano de ingresso na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = 2025;

        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        System.out.println("\n--- Empregado código: " + codigo + " ---");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");

        // Verificando os requisitos de aposentadoria
        boolean podeAposentar = false;

        if (idade >= 65) {
            podeAposentar = true;
        } else if (tempoTrabalho >= 30) {
            podeAposentar = true;
        } else if (idade >= 60 && tempoTrabalho >= 25) {
            podeAposentar = true;
        }

        if (podeAposentar) {
            System.out.println("Status: Requerer aposentadoria");
        } else {
            System.out.println("Status: Não requerer aposentadoria");
        }

        scanner.close();
    }
}
