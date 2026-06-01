import java.util.Scanner;

public class Ex07_1_CincoVezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[5];

        // Lendo os 5 valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        // Encontrando os 2 maiores
        double maior1 = Double.MIN_VALUE;
        double maior2 = Double.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            if (valores[i] > maior1) {
                maior2 = maior1;
                maior1 = valores[i];
            } else if (valores[i] > maior2) {
                maior2 = valores[i];
            }
        }

        double soma = maior1 + maior2;

        System.out.println("A soma dos 2 maiores valores é: " + soma);

        scanner.close();
    }
}
