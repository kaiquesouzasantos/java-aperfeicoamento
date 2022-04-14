package Associacao.Seminario;

public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Estudante estudante = new Estudante("Kaique", 17);
        Professor professor = new Professor("Jiraya", "Java");

        Estudante[] estudantes = {estudante};

        Seminario seminario = new Seminario("Codar até o olho sangrar", estudantes, local);

        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}
