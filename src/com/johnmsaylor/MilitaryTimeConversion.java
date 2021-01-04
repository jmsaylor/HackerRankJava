package com.johnmsaylor;

public class MilitaryTimeConversion {
    public static String timeConversion(String s) {
       String hour = s.substring(0, 2);

       boolean isAM = s.substring((s.length() - 2)).equals("AM");

       if (isAM){
           if (hour.matches("12")) {
               hour = "00";
           }
       } else {
           if (!(hour.matches("12"))) {
               hour = String.valueOf(Integer.parseInt(hour) + 12);
           }
       }

        return hour + s.substring(2, (s.length() - 2));

    }
}
