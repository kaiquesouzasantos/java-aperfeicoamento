public class MatrizPrint {
    public static void main(String[] args) {
        double numeros[][] = {{1,2,3,4,5,6,7,8,9,10},{1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.11},{2.1,2.2,2.3,2.4,2.5,2.6,2.7,2.8,2.9,2.11},{3.1,3.2,3.3,3.4,3.5,3.6,3.7,3.8,3.9,3.11},{4.1,4.2,4.3,4.4,4.5,4.6,4.7,4.8,4.9,4.11}};

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 10; coluna++){
                System.out.print(numeros[linha][coluna]+"   ");
            }
            System.out.println("");
        }
    }
}
