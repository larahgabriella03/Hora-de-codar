import java.util.Scanner;

public class Ex24_JornadaDeTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Informe o salário por hora: R$ ");
        double salarioPorHora = scanner.nextDouble();

        // Jornada normal: 40h por semana * 4 semanas = 160h por mês
        double horasNormaisMes = 40 * 4;

        double salarioTotal = 0;

        if (horasTrabalhadas <= horasNormaisMes) {
            // Sem horas extras
            salarioTotal = horasTrabalhadas * salarioPorHora;
            System.out.println("\nNenhuma hora extra trabalhada.");
        } else {
            // Com horas extras
            double horasExtras = horasTrabalhadas - horasNormaisMes;
            double salarioHoraExtra = salarioPorHora * 1.50; // 50% a mais

            double salarioNormal = horasNormaisMes * salarioPorHora;
            double salarioExtra = horasExtras * salarioHoraExtra;
            salarioTotal = salarioNormal + salarioExtra;

            System.out.println("\n--- Detalhamento ---");
            System.out.printf("Horas normais: %.0f h x R$ %.2f = R$ %.2f%n", horasNormaisMes, salarioPorHora, salarioNormal);
            System.out.printf("Horas extras: %.0f h x R$ %.2f = R$ %.2f%n", horasExtras, salarioHoraExtra, salarioExtra);
        }

        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);

        scanner.close();
    }
}
