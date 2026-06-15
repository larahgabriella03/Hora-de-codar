import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   🐱  Simulador de Pet Virtual   ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.println();

        Pet veigh = new Pet("Veigh");

        System.out.println("O Veigh nasceu! Cuide bem dele.");
        System.out.println("Objetivo: chegar à idade 50 sem perder nenhum atributo.\n");

        while (veigh.estaVivo() && !veigh.venceu()) {
            exibirMenu();
            System.out.print("Escolha: ");

            String entrada = scanner.nextLine().trim();

            switch (entrada) {
                case "1":
                    veigh.alimentar();
                    break;

                case "2":
                    veigh.brincar();
                    break;

                case "3":
                    int horas = pedirHoras(scanner);
                    veigh.descansar(horas);
                    break;

                case "4":
                    veigh.usarBanheiro();
                    break;

                case "5":
                    veigh.tomar_banho();
                    break;

                case "6":
                    veigh.verificarStatus();
                    break;

                case "7":
                    veigh.passarTempo();
                    break;

                case "0":
                    System.out.println("Encerrando o jogo. Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️  Opção inválida. Digite um número de 0 a 7.");
            }

            System.out.println();
        }

        // ── Fim de jogo ──────────────────────────────────────────────────────

        System.out.println("════════════════════════════════════");

        if (veigh.venceu()) {
            System.out.println("🏆  VOCÊ VENCEU!");
            System.out.println("O Veigh chegou à velhice com saúde!");
            veigh.verificarStatus();
        } else {
            System.out.println("💀  GAME OVER");
            System.out.println(veigh.motivoDerota());
            veigh.verificarStatus();
        }

        System.out.println("════════════════════════════════════");
        scanner.close();
    }

    // ── Helpers ───────────────────────────────────────────────────────────────

    private static void exibirMenu() {
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│  O que deseja fazer?         │");
        System.out.println("├──────────────────────────────┤");
        System.out.println("│  1 - 🍖 Alimentar            │");
        System.out.println("│  2 - 🎾 Brincar              │");
        System.out.println("│  3 - 😴 Descansar            │");
        System.out.println("│  4 - 🚽 Usar banheiro        │");
        System.out.println("│  5 - 🛁 Dar banho            │");
        System.out.println("│  6 - 📊 Ver status           │");
        System.out.println("│  7 - ⏩ Passar tempo (ciclo) │");
        System.out.println("│  0 - ❌ Sair                 │");
        System.out.println("└──────────────────────────────┘");
    }

    private static int pedirHoras(Scanner scanner) {
        System.out.print("Por quantas horas o Veigh vai descansar? (1-8): ");
        int horas = 4;
        try {
            horas = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Usando 4 horas.");
        }
        return horas;
    }
}
