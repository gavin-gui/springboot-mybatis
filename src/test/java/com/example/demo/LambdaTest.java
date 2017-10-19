package com.example.demo;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/10/9.
 */
public class LambdaTest {

    @Test
    public void test1() {
        Consumer<String> tConsumer = (x) -> System.out.println(x);
        tConsumer.accept("Hello, lambda!");

        Supplier<Integer> supplier = () -> {
            return 6;
        };

        System.out.println(supplier.get());

        Function<Integer, Integer> function = (x) -> {
            return x + 1;
        };

        System.out.println(function.apply(5));

        Predicate<Integer> predicate = (x) -> x > 5;
        System.out.println(predicate.test(6));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(v -> v));
        System.out.println("count:" + intSummaryStatistics.getCount() + ",max:" + intSummaryStatistics.getMax() + ",min:" + intSummaryStatistics.getMin() + ",average:" + intSummaryStatistics.getAverage());

        List<String> list1 = Collections.emptyList();
        Optional<List<Integer>> listOptional = Optional.ofNullable(null);

        System.out.println(listOptional.orElse(list));
    }

    @Test
    public void test3() {

    }

}
