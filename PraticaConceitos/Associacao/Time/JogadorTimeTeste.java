package Associacao.Time;

public class JogadorTimeTeste {
    public static void main(String[] args) {
       relacionamentoUnilateral();
    }

    public static void relacionamentoUnilateral(){
        // 1 jogador para 1 time
        Jogador j1 = new Jogador("CR7");
        j1.imprimeNome();

        Time time = new Time("Selecao Brasileira");
        j1.setTime(time);
        j1.imprimeNome();
    }
}
