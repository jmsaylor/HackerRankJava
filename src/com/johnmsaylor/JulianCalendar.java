package com.johnmsaylor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class JulianCalendar {
    public static String dayOfProgrammer(int year) {
        String day = "";

        if (year < 1918) {
            day = year % 4 == 0 ? "12" : "13";
        } else if (year > 1918) {
            day = (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0 ? "12" : "13";
        } else {
            day = "26";
        }

        return day + ".09." + year;
    }
}
