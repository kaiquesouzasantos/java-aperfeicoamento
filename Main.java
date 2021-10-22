import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double notas[][] = new double[2][4];
        int contagem = 1;
        double soma = 0, media = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("-- Calculo de notas para ingresso na Etec --");

        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Digite a " + contagem + "° nota: ");
                soma += (notas[linha][coluna] = in.nextDouble());
                contagem++;
            }
            media += (soma / 4);soma = 0;
        }System.out.print("Sua pontuação desconsiderando acrescimos é igual á: "+(media*=2.5));
    }
}
