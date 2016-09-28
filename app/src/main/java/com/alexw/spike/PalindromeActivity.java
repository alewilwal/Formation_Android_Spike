package com.alexw.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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



        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView0.setText(editText.getText().toString());
/*
                if(Palindrome.isPalindrome(editText.getText().toString())){

                }else{

                }
*/
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}