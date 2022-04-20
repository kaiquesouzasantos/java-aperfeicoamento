package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {
    private static final List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei", 8.99),
            new LightNovel("Overload", 1.99),
            new LightNovel("Violet Evergarden", 2.99),
            new LightNovel("No Game no Life", 86.99),
            new LightNovel("Fullmetal", 3.99)
    ));

    public static void main(String[] args) {
        exemplo_01();
        exemplo_02();
        exemplo_03();
    }

    // operacoes intermediarias -> map, filter... = meio para tratar os dados que retorna uma Stream
    // operacoes finais -> collect

    public static void exemplo_01(){
        lightNovels.sort(Comparator.comparing(LightNovel::getNome));

        List<String> titulos = new ArrayList<>();
        for(LightNovel lightNovel:lightNovels){
            if(lightNovel.getPreco() <= 4){
                titulos.add(lightNovel.getNome());
            }
            if(titulos.size() >= 3){
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titulos);
    }

    public static void exemplo_02(){
        List<String> titulos = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getNome))
                .filter(ln -> ln.getPreco() <= 4)
                .limit(3)
                .map(LightNovel::getNome)
                .collect(Collectors.toList());

        System.out.println(titulos);
    }

    public static void exemplo_03(){
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println); // list.stream.forEach() -> despercio de processamento, forEach esta presente em lis

        long count = stream
                .filter(ln -> ln.getPreco() <= 4)
                .count();
        long count2 = lightNovels.stream()
                .distinct()
                .filter(ln -> ln.getPreco() <= 4)
                .count();

        System.out.println(count);
        System.out.println(count2);
    }
}
