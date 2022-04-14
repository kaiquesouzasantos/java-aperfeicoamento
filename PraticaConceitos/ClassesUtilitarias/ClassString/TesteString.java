package ClassesUtilitarias.ClassString;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Kaique"; // String constant pool -> imutavel
        String nome2 = "Kaique";
        System.out.println(nome == nome2);

        nome.concat(" Junin"); // nome continua inalterado
        System.out.println(nome == nome2);

        String nome3 = new String("Kaique");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
