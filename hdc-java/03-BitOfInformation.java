import java.util.Scanner;

public class Ex03_BitOfInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        // Pedindo a idade
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        // Exibindo a mensagem
        System.out.println("Olá, " + nome + ", sua idade é " + idade);

        scanner.close();
    }
}
