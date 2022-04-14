package Associacao.Seminario;

public class Professor {
    private String nome, especialidade;
    private Seminario[] seminarios;

    public Professor(){}
    public Professor(String nome) {this.nome = nome;}
    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("PROFESSOR: "+this.nome);
        if(seminarios != null){
            for(Seminario seminario:this.seminarios){
                System.out.println("SEMINARIO: "+seminario.getTitulo());
                System.out.println("LOCAL: "+seminario.getLocal().getEndereco());

                if(seminario.getEstudantes() == null) continue; // estudantes != null, pula esse trecho
                System.out.println("** ALUNOS **");
                for(Estudante estudantes:seminario.getEstudantes()){
                    System.out.println("ALUNO: "+estudantes.getNome()+" | IDADE: "+estudantes.getIdade());
                }
            }
        }
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public Seminario[] getSeminarios() {return seminarios;}
    public void setSeminarios(Seminario[] seminarios) {this.seminarios = seminarios;}
}
