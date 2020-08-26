package com.geekbrains.hibernate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StreamApi {
    public static void main(String[] args) {
//
//        Разберем подробнее операцию map
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return null;
//            }
//        });

//        где Function<Integer, Integer> 1 Integer это входной тип 2 Integer это то во что мы хотим преобразовать
//
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 2;
//            }
//        }).forEach(System.out::println);

//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map( i -> i * 2).forEach( p -> {
//            System.out.println(p);
//        });
//
//        каждое число умножим на 2 и распечатаем
//
//        теперь вариант покороче
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().map( n -> n * 5).forEach(System.out::println);
//
//
//        так же бывает полезна функция count, которая возвращает число объектов в потоке например
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        System.out.println(list.stream().filter( n -> n < 5).count());
//
//
//        так же бывает полезна функция limit (которая оставляет n первых элементов)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        list.stream().filter( n -> n < 5).limit(2).forEach( t -> System.out.println(t));
//
//        так же можно сделать проверку который бы вернул boolean (например что все числа больше 0)
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,-2,-3,-4,-5));
//        System.out.println( list.stream().anyMatch( n -> n > 0));
//
//        anyMatch (хотя бы один элемент)
//        nonMatch (ни один элемент)
//
//        далее поговорим немного про Optional
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        Integer res = list.stream().filter( n -> n < 2).findFirst();
//
//        но у нас может быть такая ситцация что в потоке нет нужных объеков и нам вернуться null
//        для этого мы помещает значение в спец контейнер и делаем проверку
//
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        Optional<Integer> res = list.stream().filter(n -> n < 2).findFirst();
//        res.ifPresent(System.out::println);

        List<String> str1 = new ArrayList<String>();
        str1.add("A");
        str1.add("B");
        str1.add("C");
        str1.add("D");

        List<String> str2 = new ArrayList<String>();
        str2.add("D");
        str2.add("E");

        str1.removeIf(x -> str2.contains(x));

    }
}
