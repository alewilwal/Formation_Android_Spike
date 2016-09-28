package com.alexw.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText editText = (EditText) findViewById(R.id.edit_text);
        final TextView textView0 = (TextView) findViewById(R.id.text0);
        Button button = (Button) findViewById(R.id.button);
    }
}
