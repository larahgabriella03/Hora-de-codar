public class Ex23_NaoContaComigo {
    public static void main(String[] args) {
        // Repetindo o grupo de 1 a 20
        for (int grupo = 1; grupo <= 20; grupo++) {
            System.out.print("(" + grupo + ", ");

            // Sempre imprimindo de 1 a 10
            for (int i = 1; i <= 10; i++) {
                System.out.print(i);

                if (i < 10) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");
        }
    }
}
