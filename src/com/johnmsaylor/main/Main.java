package com.johnmsaylor.main;
import com.johnmsaylor.Memoization;
import com.johnmsaylor.NestedLogic;
import com.johnmsaylor.Node;
import com.johnmsaylor.Tabulation;
import com.johnmsaylor.medium.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(LarryArray.larrysArray(new int[]{1,2,3,5,4}));
        System.out.println(LarryArray.larrysArray(new int[]{1,3,4,2}));
        System.out.println(LarryArray.larrysArray(new int[]{1,2,3,5,4}));
        System.out.println(LarryArray.larrysArray(new int[]{4,1,3,2}));
    }

}
