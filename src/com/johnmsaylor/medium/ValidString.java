package com.johnmsaylor.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ValidString {
    public static void test() {
//        System.out.println(isValid("abcdefghhgfedecba"));
        System.out.println(isValid("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
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
        //determine total unique keys
        System.out.println(set.size());
        //all values in hashset should be s.length/unique
        //if one is +1 return YES, of more NO


        int count_limit = s.length() / set.size();

        if (count_limit == 1) {
            if((s.length() + 1) / set.size() == 2) {
                count_limit = 2;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (Character c : set.keySet()) {
            if (set.get(c) != count_limit) {
                res.add(set.get(c));
            }
            //break if res is greater than 1
        }
        System.out.println(s.length() + " " + set.size());
        System.out.println(set);

        boolean result = false;

        if (res.size() == 0) {
            result = true;
        }

        if (count_limit == 2 && res.size() == 1 && res.get(0) == 1) {
            result = true;
        }

        if (res.size() == 1 && res.get(0) - count_limit == 1) {
            result = true;
        }


        return result ? "YES" : "NO";
    }
}
