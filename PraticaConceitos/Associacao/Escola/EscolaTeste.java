package Associacao.Escola;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor p1 = new Professor("Jiraya");
        Professor p2 = new Professor("Danone");
        Professor p3 = new Professor("Furiosa");

        Professor[] professores = {p1, p2, p3};

        Escola e = new Escola("Toshiba", professores); // 1 escola para N professores
        e.imprime();
    }
}
