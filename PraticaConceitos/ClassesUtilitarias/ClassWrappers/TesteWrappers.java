package ClassesUtilitarias.ClassWrappers;

public class TesteWrappers {
    public static void main(String[] args) {
        // TIPOS PRIMITIVOS
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'N';
        boolean booleanP = false;

        // WRAPPER -> NAO SAO MAIS PRIMITIVAS
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'N';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("2");
        boolean truee = Boolean.parseBoolean("true");
        System.out.println(truee);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('a'));
    }
}
