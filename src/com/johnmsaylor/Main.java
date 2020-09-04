package com.johnmsaylor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(73);
        list.add(67);
        list.add(38);
        list.add(33);
        System.out.println(list);
        var grades = GradingStudents.gradingStudents(list);
        System.out.println(grades);
    }
}
