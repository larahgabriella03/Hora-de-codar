import java.util.Scanner;

public class Ex04_Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Área do retângulo = base * altura
        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("Área do retângulo: " + area);

        scanner.close();
    }
}
