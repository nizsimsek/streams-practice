package com.nizsimsek;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    //Listede yer alan kişilerin isimlerinin arasına virgül koyarak listeleyiniz..

    public static String namesToString(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString2(List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", ", "Names: ", "."));
    }
}
