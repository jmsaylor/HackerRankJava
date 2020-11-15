package com.johnmsaylor;

import java.math.BigInteger;

public class BigInt {
    public static void test(String number) {
        BigInteger bigInt = new BigInteger(number);
        System.out.println(bigInt.isProbablePrime(1) ? "prime" : "not prime");
    }
}
