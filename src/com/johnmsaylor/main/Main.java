package com.johnmsaylor.main;
import com.johnmsaylor.Memoization;
import com.johnmsaylor.NestedLogic;
import com.johnmsaylor.medium.*;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
         var answer = Memoization.allConstruct("can", new String[]{"c", "an", "a", "n"});
        System.out.println(answer);


////        System.out.println(Memoization.countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}, new HashMap<>()));
//        System.out.println(Memoization.allConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
//                new String[]{"ee", "eeeee", "e", "eeeeeeeeeeeeeeeeeee", "eeee", " eeeeeeeeee"}, new HashMap<>()));
    }

}
