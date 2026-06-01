public class Ex15_BrincadeiraDeAlturas {
    public static void main(String[] args) {
        // Anacleto começa com 1,50m e cresce 2cm por ano
        double alturaAnacleto = 1.50;

        // Felisberto começa com 1,10m e cresce 3cm por ano
        double alturaFelisberto = 1.10;

        int anos = 0;

        // Repetindo até Felisberto ser maior que Anacleto
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto = alturaAnacleto + 0.02;
            alturaFelisberto = alturaFelisberto + 0.03;
            anos++;
        }

        System.out.println("Felisberto será maior que Anacleto em " + anos + " anos.");
        System.out.printf("Altura de Anacleto: %.2f m%n", alturaAnacleto);
        System.out.printf("Altura de Felisberto: %.2f m%n", alturaFelisberto);
    }
}
