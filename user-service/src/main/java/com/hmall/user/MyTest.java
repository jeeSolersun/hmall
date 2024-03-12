package com.hmall.user;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author codeify
 * @since 2024/02/28 11:20
 */
public class MyTest {
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1, 4, 3).filter(val -> val > 2)
//                .sorted()
                .sorted(Comparator.comparing((Integer val) -> val).reversed())
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
