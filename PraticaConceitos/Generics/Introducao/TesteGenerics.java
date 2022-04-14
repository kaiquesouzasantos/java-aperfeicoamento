package Generics.Introducao;
import java.util.ArrayList;
import java.util.List;

public class TesteGenerics {
    public static void main(String[] args) {
        antesJava8();
        System.out.println("-----------------");
        java8();
    }

    public static void antesJava8(){
        List lista = new ArrayList<>(); // nao define o tipo de entrada
        lista.add("Stranger Things");
        lista.add("Qualquer coisa");
        lista.add(422);

        // como não se sabe o que a lista vai conter, cada item é verificado -> antes do Java8
        for(Object o:lista){
            if(o instanceof String){System.out.println(o);}
            if(o instanceof Integer){System.out.println(o);}
        }
    }

    public static void java8(){
        List<String> lista = new ArrayList<>(); // Type erasure -> List<Generics>
        lista.add("Stranger Things");
        lista.add("Qualquer coisa");

        for(String o:lista){
            System.out.println(o);
        }
    }
}
