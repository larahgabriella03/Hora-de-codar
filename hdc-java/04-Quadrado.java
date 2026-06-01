import java.util.Scanner;

public class Ex04_Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Área do quadrado = lado * lado
        System.out.print("Informe o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("Área do quadrado: " + area);

        scanner.close();
    }
}
