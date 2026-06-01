import java.util.Scanner;

public class Ex05_UmDoisETres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = scanner.nextDouble();

        // Verificando se é positivo, negativo ou neutro
        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é neutro (zero).");
        }

        scanner.close();
    }
}
