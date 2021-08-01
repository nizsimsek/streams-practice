package com.nizsimsek;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(44);
        }};

        System.out.println(getString2(list));
    }

    //Verilen sayıları inceleyip sayı tek ise başına o çift ise başına e koyunuz..

    public static String getString(List<Integer> list) {
        return null;
    }

    public static String getString2(List<Integer> list) {
        return list.stream()
                .map(i -> {
                    String s = "";
                    if (i % 2 == 0) {
                        s += "e" + i;
                    } else {

                        s += "o" + i;
                    }
                    return s;
                }).collect(Collectors.joining(","));
    }
}
