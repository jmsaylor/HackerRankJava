package com.johnmsaylor;

import java.util.Calendar;
import java.util.Locale;

public class JavaCalendar {

    public static String getDayOfWeek(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
