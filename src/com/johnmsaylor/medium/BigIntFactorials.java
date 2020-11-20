package com.johnmsaylor.medium;

import java.math.BigInteger;

public class BigIntFactorials {

    public static void extraLongFactorials(int n) {
        BigInteger total = BigInteger.valueOf(n);

        while (n-- > 1) {
            total = total.multiply(BigInteger.valueOf(n));
        }

        System.out.println(total);

    }

}
