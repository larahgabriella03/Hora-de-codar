import java.util.Scanner;

public class Ex02_HelloClarice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo o nome do usuário
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        // Exibindo a mensagem
        System.out.println("Olá, " + nome);

        scanner.close();
    }
}
