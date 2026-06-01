import java.util.Scanner;

public class Ex04_Circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Área do círculo = PI * raio²
        System.out.print("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("Área do círculo: " + area);

        scanner.close();
    }
}
