package com.johnmsaylor;

import java.util.List;

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
       for (int i = 0; i < grades.size(); i++)
       {
           Integer grade = grades.get(i);
           if (grade < 37) continue;
           int secondDigit = grade % 10;
           if (secondDigit == 3 || secondDigit == 8) {
               grades.set(i, grade + 2);
           }
           if (secondDigit == 4 || secondDigit == 9) {
               grades.set(i, grade + 1);
           }
       }
       return grades;
    }

}
