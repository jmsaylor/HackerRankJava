package com.johnmsaylor;

// 0 1 2 3 4 5 (6 / 2 == 3) 
//       ^
// 0 1 2 3 4 (5 / 2 == 2)
//     ^
public class Palindrome {
    public static void test(String A) {
        final int HALF = A.length() / 2;
        boolean result = true;

        for (int i = 0; i < HALF; i++) {
            if (A.charAt(i) != A.charAt(A.length() - (i + 1))) {
                result = false;
            }
        }

        System.out.println(result ? "YES" : "NO");

    }
    
}
