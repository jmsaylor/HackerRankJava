package com.johnmsaylor;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormat {

    public static void test(double payment) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nf.format(payment);
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nf.format(payment);

        System.out.println(france);
        System.out.println(china);
        System.out.println(india);
        System.out.println(us);
    }
}
