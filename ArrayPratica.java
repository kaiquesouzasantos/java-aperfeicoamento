public class ArrayPratica{
    public static void main(String[] args) {

        int numA[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("== Array A: ==");
        for(int out:numA){
            System.out.println(out*=out);
        }

        int numB[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("== Array B: ==");
        for(int x:numB){
            x--;
            System.out.println(numB[x]);
        }

        int[] numC = {1,2,3,4,5,6,7,8,9,10};
        int soma = 0;
        System.out.println("== Array C: ==");
        for(int x:numC){
            soma += x;
        } System.out.println(soma/=10);
    }
}
