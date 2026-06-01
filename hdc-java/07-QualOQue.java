import java.util.Scanner;

public class Ex07_QualOQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o terceiro valor: ");
        double c = scanner.nextDouble();

        // Encontrando o menor para somar os outros 2
        double menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        double soma = a + b + c - menor;

        System.out.println("A soma dos 2 maiores valores é: " + soma);

        scanner.close();
    }
}
