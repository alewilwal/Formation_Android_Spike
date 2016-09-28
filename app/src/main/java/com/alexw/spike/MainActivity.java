package com.alexw.spike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPalindrome(View view) {
        Intent intent = new Intent(this, PalindromeActivity.class);
        startActivity(intent);
    }

    public void openBrackets(View view) {
        Intent intent2 = new Intent(this, BracketsActivity.class);
        startActivity(intent2);
    }

    public void openFibonacci(View view) {
        Intent intent3 = new Intent(this, FibonacciActivity.class);
        startActivity(intent3);
    }

    public void openRandomText(View view) {
        Intent intent4 = new Intent(this, RandomTextActivity.class);
        startActivity(intent4);
    }






}
