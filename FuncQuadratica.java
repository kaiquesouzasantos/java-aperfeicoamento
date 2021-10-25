import java.util.Scanner;

public class FuncQuadratica{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c,Xv,Yv,Delta;

        System.out.print("\u001B[33mDigite o valor de [a/A]: ");
        a = input.nextDouble();

        System.out.print("Digite o valor de [b/B]: ");
        b = input.nextDouble();

        System.out.print("Digite o valor de [c/C]: ");
        c = input.nextDouble();

        Delta = Math.sqrt((b*b)-(4*a*c));

        Xv = -b/(-2*a);
        Yv = -Delta/(-4*a);

        System.out.println("\u001B[36m\nx1: "+(-b+Delta)/(2*a)+"  x2: "+(-b-Delta)/(2*a));

        System.out.println("\u001B[35mXv: "+Xv+" | "+-b+"/(-2*"+a+")");
        System.out.println("Yv: "+Yv+" | "+-Delta+"/(-4*"+a+")");

        System.out.println("\u001B[39m\nFim do Programa!");
    }
}
