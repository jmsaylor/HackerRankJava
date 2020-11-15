package com.johnmsaylor.medium;

import java.security.MessageDigest;

public class MD5 {

    public static void test(String string) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.print(String.format("%02X", b).toLowerCase());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
