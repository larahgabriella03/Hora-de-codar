import java.util.Scanner;

public class Ex04_Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Área do triângulo = (base * altura) / 2
        System.out.print("Informe a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Área do triângulo: " + area);

        scanner.close();
    }
}
