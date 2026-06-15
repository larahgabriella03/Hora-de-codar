# 🐱 Veigh — Simulador de Pet Virtual

Projeto Java de Programação Orientada a Objetos com bichinho virtual.

## Como rodar no VS Code

### Pré-requisitos
- [Java JDK 17+](https://adoptium.net/)
- [VS Code](https://code.visualstudio.com/)
- Extensão **Extension Pack for Java** (da Microsoft)

### Passos

1. Abra a pasta `veigh-pet` no VS Code:
   ```
   File → Open Folder → selecione a pasta veigh-pet
   ```

2. Abra o arquivo `src/Main.java`

3. Clique em **▶ Run** que aparece acima do método `main`, ou pressione `F5`

4. O jogo roda no terminal integrado do VS Code

### Compilar e rodar pelo terminal

```bash
cd veigh-pet/src
javac Pet.java Main.java
java Main
```

---

## Estrutura do projeto

```
veigh-pet/
└── src/
    ├── Pet.java    ← classe do bichinho (atributos e métodos)
    └── Main.java   ← loop do jogo e menu interativo
```

---

## Atributos do Veigh

| Atributo          | Início | Derrota se... |
|-------------------|--------|---------------|
| Fome              | 20     | ≥ 100         |
| Felicidade        | 80     | ≤ 0           |
| Cansaço           | 10     | ≥ 100         |
| Vontade banheiro  | 0      | ≥ 100         |
| Sujeira           | 0      | ≥ 100         |
| Idade             | 0      | —             |

**Vitória:** chegar à idade 50.

## Passagem do tempo (por ciclo)

| Atributo         | Variação |
|------------------|----------|
| Fome             | +3       |
| Felicidade       | -3       |
| Cansaço          | +10      |
| Sujeira          | +3       |
| Vontade banheiro | +2       |
| Idade            | +1       |

## Ações disponíveis

| Ação            | Efeito                                  |
|-----------------|-----------------------------------------|
| Alimentar       | Fome -20, Banheiro +15                  |
| Brincar         | Felicidade +15, Cansaço +20, Sujeira +10|
| Descansar (Nh)  | Cansaço -(100 × N/8)                   |
| Usar banheiro   | Banheiro -40                            |
| Dar banho       | Sujeira -40                             |
| Passar tempo    | Aplica 1 ciclo de tempo                 |
