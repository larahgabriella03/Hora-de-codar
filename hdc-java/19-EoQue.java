import java.util.Scanner;

public class Ex19_EoQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o lado A do triângulo: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o lado B do triângulo: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o lado C do triângulo: ");
        double c = scanner.nextDouble();

        // Para formar um triângulo, cada lado deve ser menor que a soma dos outros 2
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os lados formam um TRIÂNGULO!");
        } else {
            System.out.println("Os lados NÃO formam um triângulo.");
        }

        scanner.close();
    }
}
