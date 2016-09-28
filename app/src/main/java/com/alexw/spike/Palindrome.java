package com.alexw.spike;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Palindrome {

    public boolean isPalindrome(String inputWord){

        inputWord = inputWord.toLowerCase();

        int gauche = 0;
        int droite = inputWord.length() - 1;
        boolean palindrome = true;
        while ((gauche < droite) && palindrome) {
            if (inputWord.charAt(gauche) != inputWord.charAt(droite)) {
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
