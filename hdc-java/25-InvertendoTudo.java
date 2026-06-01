import java.util.Scanner;

public class Ex25_InvertendoTudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] valores = new String[12];

        // Lendo os 12 valores
        System.out.println("Informe 12 valores (letras ou números):");
        for (int i = 0; i < 12; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.next();
        }

        // Saída 1: invertendo a posição dos elementos
        System.out.print("\nSaída 1 (invertido): ");
        for (int i = 11; i >= 0; i--) {
            System.out.print(valores[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Separando números e letras
        String numeros = "";
        String letras = "";

        for (int i = 11; i >= 0; i--) {
            try {
                Integer.parseInt(valores[i]);
                // É um número
                if (!numeros.isEmpty()) {
                    numeros = numeros + ", ";
                }
                numeros = numeros + valores[i];
            } catch (NumberFormatException e) {
                // É uma letra/texto
                if (!letras.isEmpty()) {
                    letras = letras + ", ";
                }
                letras = letras + valores[i];
            }
        }

        // Saída 2: invertido separado por tipo
        System.out.println("Saída 2 (invertido por tipo): " + numeros + " - " + letras);

        scanner.close();
    }
}
