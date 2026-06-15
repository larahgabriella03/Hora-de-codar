public class Pet {

    private String nome;
    private int fome;
    private int felicidade;
    private int cansaco;
    private int idade;
    private int vontadeBanheiro;
    private int sujeira;

    public Pet(String nome) {
        this.nome        = nome;
        this.fome        = 20;
        this.felicidade  = 80;
        this.cansaco     = 10;
        this.idade       = 0;
        this.vontadeBanheiro = 0;
        this.sujeira     = 0;
    }

    // ── Ações ──────────────────────────────────────────────────────────────────

    public void alimentar() {
        fome             = Math.max(0, fome - 20);
        vontadeBanheiro  = Math.min(100, vontadeBanheiro + 15);
        System.out.println("🍖 " + nome + " comeu! Fome -20, vontade de banheiro +15.");
    }

    public void brincar() {
        felicidade = Math.min(100, felicidade + 15);
        cansaco    = Math.min(100, cansaco + 20);
        sujeira    = Math.min(100, sujeira + 10);
        System.out.println("🎾 " + nome + " brincou! Felicidade +15, cansaço +20, sujeira +10.");
    }

    public void descansar(int horas) {
        if (horas < 1) horas = 1;
        if (horas > 8) horas = 8;

        int reducao = (int) Math.round(100.0 * horas / 8.0);
        cansaco = Math.max(0, cansaco - reducao);
        System.out.println("😴 " + nome + " dormiu " + horas + "h. Cansaço -" + reducao + ".");
    }

    public void usarBanheiro() {
        vontadeBanheiro = Math.max(0, vontadeBanheiro - 40);
        System.out.println("🚽 " + nome + " usou o banheiro! Banheiro -40.");
    }

    public void tomar_banho() {
        sujeira = Math.max(0, sujeira - 40);
        System.out.println("🛁 " + nome + " tomou banho! Sujeira -40.");
    }

    public void passarTempo() {
        fome            = Math.min(100, fome + 3);
        felicidade      = Math.max(0,   felicidade - 3);
        cansaco         = Math.min(100, cansaco + 10);
        sujeira         = Math.min(100, sujeira + 3);
        vontadeBanheiro = Math.min(100, vontadeBanheiro + 2);
        idade++;
        System.out.println("⏱  Ciclo " + idade + " passou.");
    }

    // ── Status ─────────────────────────────────────────────────────────────────

    public void verificarStatus() {
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║  Status de " + padRight(nome, 18) + "║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║  Idade       : " + padLeft(String.valueOf(idade), 3)          + " ciclos       ║");
        System.out.println("║  Fome        : " + barra(fome)          + " " + padLeft(String.valueOf(fome), 3)  + "          ║");
        System.out.println("║  Felicidade  : " + barra(felicidade)    + " " + padLeft(String.valueOf(felicidade), 3) + "          ║");
        System.out.println("║  Cansaço     : " + barra(cansaco)       + " " + padLeft(String.valueOf(cansaco), 3) + "          ║");
        System.out.println("║  Banheiro    : " + barra(vontadeBanheiro) + " " + padLeft(String.valueOf(vontadeBanheiro), 3) + "          ║");
        System.out.println("║  Sujeira     : " + barra(sujeira)       + " " + padLeft(String.valueOf(sujeira), 3) + "          ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("  Humor: " + humor());
        System.out.println("  Meta : chegar à idade 50 (" + idade + "/50)\n");
    }

    // ── Verificação de fim de jogo ─────────────────────────────────────────────

    public boolean estaVivo() {
        return fome < 100 && cansaco < 100 && felicidade > 0
            && vontadeBanheiro < 100 && sujeira < 100;
    }

    public boolean venceu() {
        return idade >= 50;
    }

    public String motivoDerota() {
        if (fome            >= 100) return "😿 " + nome + " morreu de fome!";
        if (cansaco         >= 100) return "😵 " + nome + " colapsou de cansaço!";
        if (felicidade      <= 0)   return "💔 " + nome + " ficou triste demais...";
        if (vontadeBanheiro >= 100) return "💦 " + nome + " não conseguiu segurar!";
        if (sujeira         >= 100) return "🤮 " + nome + " ficou sujo demais!";
        return "Motivo desconhecido.";
    }

    // ── Helpers internos ───────────────────────────────────────────────────────

    private String humor() {
        if (felicidade >= 70 && fome <= 40 && cansaco <= 50) return "😸 Feliz e animado!";
        if (fome       >= 70)                                 return "😿 Com muita fome...";
        if (cansaco    >= 70)                                 return "😪 Muito cansado...";
        if (felicidade <= 30)                                 return "😾 Entediado e triste...";
        if (vontadeBanheiro >= 70)                            return "🙀 Precisa do banheiro!";
        if (sujeira    >= 70)                                 return "🤢 Precisando de banho...";
        return "🐱 Bem, mais ou menos.";
    }

    private String barra(int valor) {
        int blocos = valor / 10;
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < 10; i++) sb.append(i < blocos ? "█" : "░");
        sb.append("]");
        return sb.toString();
    }

    private String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    private String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }

    // ── Getters ────────────────────────────────────────────────────────────────

    public String getNome()             { return nome; }
    public int    getFome()             { return fome; }
    public int    getFelicidade()       { return felicidade; }
    public int    getCansaco()          { return cansaco; }
    public int    getIdade()            { return idade; }
    public int    getVontadeBanheiro()  { return vontadeBanheiro; }
    public int    getSujeira()          { return sujeira; }
}
