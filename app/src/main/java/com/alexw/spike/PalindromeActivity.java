package com.alexw.spike;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
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

        final FloatingActionButton myFabView = (FloatingActionButton) findViewById(R.id.myFAB);
        myFabView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View myView) {

            }
        });


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /* Reverse the word */
                textView0.setText(new StringBuilder(editText.getText().toString()).reverse().toString());

                /* Change FAB color is is Palindrome */
                if(Palindrome.isPalindrome(editText.getText().toString())){
                    myFabView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#4CAF50")));
                }else{
                    myFabView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FF5252")));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}