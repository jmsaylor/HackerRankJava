package com.johnmsaylor.medium;

import java.util.*;
import java.util.stream.Collectors;

public class ValidString {
    public static void test() {
        System.out.println(isValid("aabbccddeefghi"));
//        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }

    static String isValid(String s) {
        //count the characters in a hashmap

        HashMap<Character, Integer> set = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (!set.containsKey(c)) {
                set.put(c, 1);
            } else {
                int temp = set.get(c);
                set.put(c, ++temp);
            }
        }

        HashMap<Integer, Integer> counts = new HashMap<>();

        for (Character c : set.keySet()) {
            if (!counts.containsKey(set.get(c))) {
                counts.put(set.get(c), 1);
            } else {
                int temp = counts.get(set.get(c));
                temp++;
                counts.put(set.get(c), temp);
            }
        }

        System.out.println(counts);

        boolean result = false;

        if (counts.size() == 1) result = true;

        if (counts.size() == 2 && counts.containsKey(1) && counts.get(1) == 1) result = true;

        if (counts.size() == 2 && counts.containsValue(1)) {
            List<Integer> keys = new ArrayList<>();
            keys.addAll(counts.keySet());
            int min, max = 0;
            if (keys.get(1) > keys.get(0)) {
                min = keys.get(0);
                max = keys.get(1);
            } else {
                min = keys.get(1);
                max = keys.get(0);
            }

            if (max - min == 1 && counts.get(max) == 1) result = true;

        }

        return result ? "YES" : "NO";
    }
}
