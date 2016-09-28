package com.alexw.spike;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Palindrome {

    public static boolean isPalindrome(String s0){
        s0 = s0.toLowerCase();
        int gauche = 0;
        int droite = s0.length() - 1;
        boolean palindrome = true;
        while ((gauche < droite) && palindrome) {
            if (s0.charAt(gauche) != s0.charAt(droite)) {
                palindrome = false;
            }
            gauche++;
            droite--;
        }
        if (palindrome) {
            return true;
        } else {
            return false;
        }
    }




    
}
