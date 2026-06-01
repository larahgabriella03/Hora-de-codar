public class Ex22_ContaComigo {
    public static void main(String[] args) {
        int numero = 1;

        // Repetindo até o primeiro número chegar a 20
        for (int grupo = 1; grupo <= 20; grupo++) {
            System.out.print("(" + grupo + ", ");

            // Imprimindo os 10 números do grupo
            for (int i = 0; i < 10; i++) {
                System.out.print(numero);
                numero++;

                if (i < 9) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");
        }
    }
}
