import java.util.Scanner;

public class MatrizIntroducao{
    public static void main(String[] args) {

	    double aluno[][] = new double[5][5];
	    double soma = 0;
	    int contagem = 1;

	    Scanner in = new Scanner(System.in);
	    System.out.println("-- Média de cinco alunos --");

	    for(int linha = 0; linha < 5; linha++){
	        for(int coluna = 0; coluna < 5; coluna++) {
                System.out.print("Digite a nota: ");
                soma += (aluno[linha][coluna]=in.nextDouble());
            }
	        System.out.print("\n|== Média do aluno "+contagem+"°: "+(soma/=5)+" ==|\n\n");
	        contagem++;
        }
    }
}
