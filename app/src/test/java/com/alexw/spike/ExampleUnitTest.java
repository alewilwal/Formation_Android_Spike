package com.alexw.spike;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
//
    @Test
    public void addition_isCorrect_if_isPalindrome() throws Exception {
        Palindrome palindrome = new Palindrome();
        assertEquals(true, palindrome.isPalindrome("lol"));
    }
}