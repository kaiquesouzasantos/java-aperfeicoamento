package Associacao.Time;

public class JogadoresTimeTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Cafu");
        Jogador j2 = new Jogador("Neymar");
        Time time = new Time("Brasil");
        Jogador[] jogadores ={j1, j2};

        j1.setTime(time);
        j2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        j1.imprimeNome();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
