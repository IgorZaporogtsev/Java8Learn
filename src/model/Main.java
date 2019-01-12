package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        Artist artist_1 = new Artist("PilotsGroup", "London");
        Artist artist_2 = new Artist("BackStreetGroup", "Newcastle");

        List<Artist> listArtists = new ArrayList<>();
        listArtists.add(artist_1);
        listArtists.add(artist_2);

        //Если на стрим возвращает не void то мы должны присвоить его к переменной
        long a = listArtists.stream()
                .filter(artist -> artist.isFrom("London"))
                .count();
                //.forEach(System.out::println);

        System.out.println(a);

        //------------collect
        List<String> collected1 = Stream.of("a", "b", "c")
                .collect(toList());

        System.out.println(collected1);

        //-----------map

        List<String> collected2 = new ArrayList<>();
        for (String string : asList("a", "b", "hello")) {
            String uppercaseString = string.toUpperCase();
            collected2.add(uppercaseString);
        }

        System.out.println("- map_1: " + collected2);

        List<String> collected3 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase()) //(String::toUpperCase)
                .collect(toList());

        System.out.println("- map_2: " + collected3);

        //--------filter---

        List<String> beginningWithNumbers1 = new ArrayList<>();
        for(String value : asList("a", "1abc", "abc1")) {
            if (isDigit(value.charAt(0))) {
                beginningWithNumbers1.add(value);
            }
        }

        System.out.println("- filter_1: " + beginningWithNumbers1);

        List<String> beginningWithNumbers2 = Stream.of("a", "1abc", "abc1")
                .filter(value -> isDigit(value.charAt(0)))
                .collect(toList());

        System.out.println("- filter_2: " + beginningWithNumbers2);

        //--------flatMap---

        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4))
                .flatMap(numbers -> numbers.stream()) //Collection::stream
                .collect(toList());

        System.out.println("- flatMap_1: " + together);

        
    }


}
