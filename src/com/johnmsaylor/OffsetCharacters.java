package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OffsetCharacters {

    public static void test() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you word");
        String word = scanner.next();

        List<Character> evenChars = new ArrayList<>();
        List<Character> oddChars = new ArrayList<>();

        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                evenChars.add(charArray[i]);
            } else {
                oddChars.add(charArray[i]);
            }
        }

        evenChars.stream().forEach(System.out::print);
        System.out.print(' ');
        oddChars.stream().forEach(System.out::print);
        System.out.println();

    }
}
