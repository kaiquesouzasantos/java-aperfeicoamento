import java.util.Random;

public class MatrizPrintRandom{
    public static void main(String[] args) {
	    Random random = new Random();
	    int soma = 0;
	    int matriz[][] = new int[50][50];

	    for(int linha = 0; linha < 50;linha++){
	        for(int coluna = 0; coluna < 50; coluna++){
	            soma+= (matriz[linha][coluna] = random.nextInt());
            }
        }

        for(int j = 0; j < 50;j++){
            for(int k = 0; k < 50; k++){
                System.out.print(matriz[j][k]+"   ");
            }
            System.out.println("");
        }
        System.out.print("\n"+soma);
    }
}
