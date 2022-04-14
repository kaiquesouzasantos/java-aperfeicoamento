package Associacao.Time;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("CR7");
        Jogador j2 = new Jogador("Messi");
        Jogador j3 = new Jogador("Neymar");

        Jogador[] jogadores = {j1, j2, j3};

        for(Jogador jogador:jogadores){
            jogador.imprimeNome();
        }
    }
}
