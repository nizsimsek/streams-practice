package com.nizsimsek;

import java.util.Arrays;

public class LetterCount {

    //İsimler dizesinde bulunan isimlerin harf sayısı beşten büyük olanların harflerinin toplamını bulunuz..

    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return 0;
    }

    public static int getTotalNumberOfLettersOfNamesLongerThanFive2(String... names) {
        return Arrays.stream(names)
                .filter(n -> n.length() > 5)
                .mapToInt(n -> n.toCharArray().length)
                .sum();
    }
}
