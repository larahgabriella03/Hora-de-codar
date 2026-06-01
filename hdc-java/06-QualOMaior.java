import java.util.Scanner;

public class Ex06_QualOMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double c = scanner.nextDouble();

        double maior = a;

        if (b > maior) {
            maior = b;
        }

        if (c > maior) {
            maior = c;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
